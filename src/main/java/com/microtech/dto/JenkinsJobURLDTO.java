package com.microtech.dto;

import com.microtech.entity.Status;
import lombok.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class JenkinsJobURLDTO {
    private int id;
    private List<String> url;
    private Status status;
}
