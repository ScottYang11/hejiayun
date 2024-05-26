package com.msb.hjycommunity.web.test;

import javax.validation.constraints.NotNull;

public class User {

    private String userId;
    @NotNull(message = "username 不能为空")
    private String username;

    public User() {
    }

    public User(String userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    /**
     * 获取
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    public String toString() {
        return "User{userId = " + userId + ", username = " + username + "}";
    }
}
