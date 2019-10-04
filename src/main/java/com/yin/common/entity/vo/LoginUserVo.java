package com.yin.common.entity.vo;


import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * 登录用户
 */
@Data
public class LoginUserVo {

    private String name;

    private String token;

    @NotBlank
    @Length(min = 1, max = 50, message = "账号长度需要在1到50之间")
    private String username;

    @NotBlank
    @Length(min = 1, max = 30, message = "密码长度需要在1到30之间")
    private String password;

}
