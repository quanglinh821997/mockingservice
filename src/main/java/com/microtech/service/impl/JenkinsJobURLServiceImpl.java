package com.microtech.service.impl;

import com.microtech.common.utils.DataUtils;
import com.microtech.common.utils.JSonUtils;
import com.microtech.dto.JenkinsJobURLDTO;
import com.microtech.entity.JenkinsJobURL;
import com.microtech.entity.ProjectRule;
import com.microtech.service.JenkinsJobURLService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.stream.Collectors;

import static com.microtech.common.utils.DataUtils.isNullOrEmpty;
import static com.microtech.common.utils.DataUtils.notNullOrEmpty;

@Slf4j
@Service
public class JenkinsJobURLServiceImpl implements JenkinsJobURLService {

    private String pushRuleConfigPath;



    @Value("${app.config.path}")
    private String configPath;

    @Override
    public ProjectRule getProjectRule() {
//        pushRuleConfigPath = configPath.endsWith("/") ?
//                (configPath + "rules_project.json") :
//                (configPath + "/rules_project.json");
//        String content = FileUtils.readFileToString(new File(pushRuleConfigPath), StandardCharsets.UTF_8);
//        projectRule = JSonUtils.fromJson(content, ProjectRule.class);
//        return projectRule;

        String content = null;
        try {
            assert notNullOrEmpty(configPath);
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("config/rules_project.json").getFile());

            content = FileUtils.readFileToString(file, StandardCharsets.UTF_8);

        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
        ProjectRule projectRule = JSonUtils.fromJson(content, ProjectRule.class);
        return projectRule;
    }


    @Override
    public Object accept(JenkinsJobURLDTO jenkinsJobURLDTO) throws IOException {

//        File file = new File("/home/quanglinh/mycode/jenkins-job.txt");
//        String original = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
//        JenkinsJobURLDTO originalDto = JSonUtils.fromJson(original, JenkinsJobURLDTO.class);
//        String data = JSonUtils.toJson(originalDto);
//        FileUtils.writeStringToFile(file, data, StandardCharsets.UTF_8);
//        return FileUtils.readFileToString(file, StandardCharsets.UTF_8);

            String content = JSonUtils.toJson(jenkinsJobURLDTO);
            FileUtils.writeStringToFile(new File("/home/quanglinh/mycode/jenkins-job.txt"), content, StandardCharsets.UTF_8);
            return FileUtils.readFileToString(new File("/home/quanglinh/mycode/jenkins-job.txt"), StandardCharsets.UTF_8);

    }
}
