package com.example.pojo.qo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel("UserQO")
public class UserQO {
    private String username;
    private String realname;
    private String email;
    private String mobile;
}
