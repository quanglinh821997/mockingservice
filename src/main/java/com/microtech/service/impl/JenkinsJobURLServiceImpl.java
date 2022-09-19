package com.microtech.service.impl;

import com.microtech.common.utils.JSonUtils;
import com.microtech.dto.JenkinsJobURLDTO;
import com.microtech.entity.ProjectRule;
import com.microtech.service.JenkinsJobURLService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
public class JenkinsJobURLServiceImpl implements JenkinsJobURLService {

    private ProjectRule projectRule;

    private String configPath;

    @Override
    public Object accept(JenkinsJobURLDTO jenkinsJobURLDTO) throws IOException {

//        File file = new File(configPath);
//        String original = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
//        JenkinsJobURLDTO originalDto = JSonUtils.fromJson(original, JenkinsJobURLDTO.class);
//        JenkinsJobURL jenkinsJobURL = new JenkinsJobURL();
//        BeanUtils.copyProperties(jenkinsJobURLDTO, jenkinsJobURL);
//        String data = JSonUtils.toJson(jenkinsJobURL);
//        FileUtils.writeStringToFile(new File("D:\\C\\test\\jenkins-job.txt"), data, StandardCharsets.UTF_8);
//        return FileUtils.readFileToString(new File("D:\\C\\test\\jenkins-job.txt"), StandardCharsets.UTF_8);

//
            String content = JSonUtils.toJson(projectRule);
            FileUtils.writeStringToFile(new File("D:\\C\\test\\jenkins-job.txt"), content, StandardCharsets.UTF_8);
            return FileUtils.readFileToString(new File("D:\\C\\test\\jenkins-job.txt"), StandardCharsets.UTF_8);

    }
}
