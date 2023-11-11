package com.example.demo.entity;

import lombok.Data;

@Data
public class UserEntity {
    private Integer userId;
    private String username;
    private String password;
    private String headPath;
}
