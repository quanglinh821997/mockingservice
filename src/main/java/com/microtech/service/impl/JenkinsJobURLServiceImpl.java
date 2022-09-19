package com.microtech.service.impl;

import com.microtech.common.utils.DataUtils;
import com.microtech.common.utils.JSonUtils;
import com.microtech.dto.JenkinsJobURLDTO;
import com.microtech.entity.ProjectRule;
import com.microtech.service.JenkinsJobURLService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
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

    private ProjectRule projectRule;

    private String configPath;


    @Override
    public Object accept(JenkinsJobURLDTO jenkinsJobURLDTO) throws IOException {

//        File file = new File("/home/quanglinh/mycode/jenkins-job.txt");
//        String original = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
//        JenkinsJobURLDTO originalDto = JSonUtils.fromJson(original, JenkinsJobURLDTO.class);
//        JenkinsJobURL jenkinsJobURL = new JenkinsJobURL();
//        BeanUtils.copyProperties(jenkinsJobURLDTO, jenkinsJobURL);
//        String data = JSonUtils.toJson(projectRule);
//        FileUtils.writeStringToFile(new File("/home/quanglinh/mycode/jenkins-job.txt"), data, StandardCharsets.UTF_8);
//        return FileUtils.readFileToString(new File("/home/quanglinh/mycode/jenkins-job.txt"), StandardCharsets.UTF_8);


            String content = JSonUtils.toJson(projectRule);
            FileUtils.writeStringToFile(new File("/home/quanglinh/mycode/jenkins-job.txt"), content, StandardCharsets.UTF_8);
            return FileUtils.readFileToString(new File("/home/quanglinh/mycode/jenkins-job.txt"), StandardCharsets.UTF_8);

    }
}
