package test.entity;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor //包含所有参数的构造方法
@NoArgsConstructor  //无参构造方法
public class User {
    private int id;
    private String name;
}
