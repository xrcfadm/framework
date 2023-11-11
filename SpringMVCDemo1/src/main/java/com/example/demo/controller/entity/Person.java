package com.example.demo.controller.entity;

import lombok.Data;

@Data
//利用Lombok，使得实体类编写及其简易
// @Data《==》@Getter + @Setter + @ToString + @EqualsAndHashCode +
//           @RequiredArgsConstructor + @NoArgsConstructor
public class Person {
    private int id;
    private String username;
    private String password;
}
