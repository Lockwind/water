package com.example.demo.response;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message<T> {
    private int Code;
    private String Msg;
    private T Date;

    public Message() {
    }

    public Message(String msg, T date) {
        Msg = msg;
        Date = date;
    }

    public Message(int code, String msg, T date) {
        Code = code;
        Msg = msg;
        Date = date;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public T getDate() {
        return Date;
    }

    public void setDate(T date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "Code=" + Code +
                ", Msg='" + Msg + '\'' +
                ", Date=" + Date +
                '}';
    }
}