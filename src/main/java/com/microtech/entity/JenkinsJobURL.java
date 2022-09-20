package com.microtech.entity;

import lombok.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JenkinsJobURL {
    private int id;
    private List<String> url;
    private Status status;
}
