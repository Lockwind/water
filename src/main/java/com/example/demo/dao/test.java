package com.example.demo.dao;

import java.util.Arrays;

public class test {
    private String[][] Fileter;
    private Integer Type;

    public test(String[][] fileter, Integer type) {
        Fileter = fileter;
        Type = type;
    }

    @Override
    public String toString() {
        return "test{" +
                "Fileter=" + Arrays.toString(Fileter) +
                ", Type=" + Type +
                '}';
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer type) {
        Type = type;
    }

    public String[][] getFileter() {
        return Fileter;
    }

    public void setFileter(String[][] fileter) {
        Fileter = fileter;
    }
}
