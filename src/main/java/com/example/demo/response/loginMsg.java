package com.example.demo.response;

public class loginMsg {
    private String token;
    private String role;
    private Integer userid;

    public loginMsg(String token, String role, Integer userid) {
        this.token = token;
        this.role = role;
        this.userid = userid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
