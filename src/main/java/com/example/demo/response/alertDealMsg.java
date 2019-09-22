package com.example.demo.response;

public class alertDealMsg {

    private Integer id;
    private String Tile;


    public alertDealMsg() {
    }

    public alertDealMsg(Integer id, String tile) {
        this.id = id;
        Tile = tile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTile() {
        return Tile;
    }

    public void setTile(String tile) {
        Tile = tile;
    }
}
