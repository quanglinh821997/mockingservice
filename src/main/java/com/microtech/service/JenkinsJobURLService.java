package com.microtech.service;

import com.microtech.dto.JenkinsJobURLDTO;
import com.microtech.entity.ProjectRule;
import org.springframework.stereotype.Service;

import java.io.IOException;
public interface JenkinsJobURLService {
    Object accept(JenkinsJobURLDTO jenkinsJobURLDTO) throws IOException;
}
