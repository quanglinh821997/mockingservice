package com.microtech.service;

import com.microtech.dto.JenkinsJobURLDTO;
import com.microtech.entity.ProjectRule;
import org.springframework.stereotype.Service;

import java.io.IOException;
public interface JenkinsJobURLService {

    public ProjectRule getProjectRule() throws IOException;
    Object accept(JenkinsJobURLDTO jenkinsJobURLDTO) throws IOException;
}
