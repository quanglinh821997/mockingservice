package com.microtech.config;

import com.microtech.common.utils.DataUtils;
import com.microtech.common.utils.JSonUtils;
import com.microtech.entity.ProjectRule;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.stream.Collectors;

import static com.microtech.common.utils.DataUtils.*;


@Setter
@Slf4j
@Configuration
public class RuleManager {

    private String pushRuleConfigPath;

    private ProjectRule projectRule;

    @Value("${app.config.path}")
    private String configPath;


    public ProjectRule getProjectRule() {
        String content = null;
        try {
            assert notNullOrEmpty(configPath);

            pushRuleConfigPath = configPath.endsWith("/") ?
                    (configPath + "rules_project.json") :
                    (configPath + "/rules_project.json");
            content = FileUtils.readFileToString(new File(pushRuleConfigPath), StandardCharsets.UTF_8);

        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
        projectRule = JSonUtils.fromJson(content, ProjectRule.class);
        correctProjectRule();
        return projectRule;
    }

    private void correctProjectRule() {
        Set<String> rules = projectRule.getAllowedExtensions();
        rules = correctExtensions(rules);
        projectRule.setAllowedExtensions(rules);

        rules = projectRule.getAllowedBigFileExtensions();
        rules = correctExtensions(rules);
        projectRule.setAllowedBigFileExtensions(rules);

        rules = projectRule.getAllowedPublicProjects();
        rules = removeEmptyStrings(rules);
        projectRule.setAllowedPublicProjects(rules);

        rules = projectRule.getAllowedUserProjects();
        rules = removeEmptyStrings(rules);
        projectRule.setAllowedUserProjects(rules);
    }

    private Set<String> removeEmptyStrings(Set<String> set) {
        if (isNullOrEmpty(set)) {
            return set;
        }
        set.forEach(String::trim);
        return set.stream().filter(DataUtils::notNullOrEmpty).collect(Collectors.toSet());
    }

    private Set<String> correctExtensions(Set<String> extensions) {
        if (isNullOrEmpty(extensions))
            return extensions;

        extensions = removeEmptyStrings(extensions);
        return extensions.stream()
                .map(extension -> {
                    extension = extension.charAt(0) == '.' ?
                            extension.substring(1) : extension;
                    return extension.toLowerCase();
                })
                .collect(Collectors.toSet());
    }

}




