package com.microtech.dto;

import com.microtech.entity.Status;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class JenkinsJobURLDTO {
    private int id;
    private String url;
    private Status status;
}
