package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.type.Alias;

import javax.validation.constraints.NotBlank;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Alias("user")
public class User {
    private Integer userId;
    private String userName;
    private String userPwd;
    private String deviceToken;
    private Integer pId;
    private String part;

    public User() {
    }

    public User(Integer userId, String userPwd) {
        this.userId = userId;
        this.userPwd = userPwd;
    }

    public User(String userName, String userPwd, String deviceToken, Integer pId, String part) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.deviceToken = deviceToken;
        this.pId = pId;
        this.part = part;
    }

    public User(Integer userId, String userName, String userPwd, String deviceToken, Integer pId, String part) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.deviceToken = deviceToken;
        this.pId = pId;
        this.part = part;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", deviceToken='" + deviceToken + '\'' +
                ", pId=" + pId +
                ", part='" + part + '\'' +
                '}';
    }

}
