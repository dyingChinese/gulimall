package com.myproject.gulimall.member.exception;

/**
 * @Description:
 * @author Chineseblack23
 * @version 1.0
 * @date 2023/1/27 14:09
 **/
public class UsernameException extends RuntimeException {


    public UsernameException() {
        super("存在相同的用户名");
    }
}
