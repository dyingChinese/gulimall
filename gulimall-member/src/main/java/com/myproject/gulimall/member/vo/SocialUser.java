package com.myproject.gulimall.member.vo;

import lombok.Data;

/**
 * @Description: 社交用户信息
 * @author Chineseblack23
 * @version 1.0
 * @date 2023/1/27 14:09
 **/

@Data
public class SocialUser {

    private String access_token;

    private String remind_in;

    private long expires_in;

    private String uid;

    private String isRealName;

}
