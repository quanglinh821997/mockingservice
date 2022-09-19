package com.microtech.entity;

import lombok.*;

import javax.persistence.Entity;
@Data
@Getter
@Setter
@Builder
public class Status {
    public static final int CREATED = 1;
    public static final int DONE = 2;
}
