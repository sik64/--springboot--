package com.example.demo12.dto;

public class ItemDTO {
    private String itemname;
    private String itemprice;

    public ItemDTO(){
    }
    public ItemDTO(String itemname,String itemprice){
        this.itemname = itemname;
        this.itemprice = itemprice;
    }
    public String getItemname(){
        return itemname;
    }
    public String setItemname(String itemname){
        return this.itemname = itemname;
    }
    public String getItemprice(){
        return itemprice;
    }
    public String setItemprice(String itemprice){
        return this.itemprice = itemprice;
    }

}
