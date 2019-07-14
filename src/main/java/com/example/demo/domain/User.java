package com.example.demo.domain;

import org.apache.ibatis.type.Alias;

import javax.validation.constraints.NotBlank;

@Alias("user")
public class User {

    private Integer userid;
    private String username;
    private String userpwd;
    private String devicetoken;

    public User() {
    }

    public User(String username, String userpwd) {
        this.username = username;
        this.userpwd = userpwd;
    }

    public User(String username, String userpwd, String devicetoken) {
        this.username = username;
        this.userpwd = userpwd;
        this.devicetoken = devicetoken;
    }

    public User(Integer userid, String username, String userpwd, String devicetoken) {
        this.userid = userid;
        this.username = username;
        this.userpwd = userpwd;
        this.devicetoken = devicetoken;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getDevicetoken() {
        return devicetoken;
    }

    public void setDevicetoken(String devicetoken) {
        this.devicetoken = devicetoken;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", devicetoken='" + devicetoken + '\'' +
                '}';
    }
}
