package com.microtech.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JenkinsJobURL {
    private int id;
    private String url;
    private Status status;
}
