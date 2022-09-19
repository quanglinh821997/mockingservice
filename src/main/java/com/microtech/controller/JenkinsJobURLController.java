package com.microtech.controller;

import com.microtech.dto.JenkinsJobURLDTO;
import com.microtech.service.JenkinsJobURLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;
import java.io.IOException;

@RestController
public class JenkinsJobURLController {

    @Autowired private JenkinsJobURLService jenkinsJobURLService;

    @PostMapping("/accept")
    public Object acceptRequest(@RequestBody JenkinsJobURLDTO jenkinsJobURLDTO) throws IOException {
       return jenkinsJobURLService.accept(jenkinsJobURLDTO);
    }
}
