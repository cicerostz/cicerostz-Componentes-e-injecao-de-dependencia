package com.example.entities;

public class Order {
    private Integer code;
    private Double basic;
    private Double discount;

//    public Order(){
//
//    }

    public Order(int code, Double basic, Double discount){
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    //CODE
    public Integer getCode(){
        return code;
    }
    public void setCode(Integer code){
        this.code = code;
    }

    //BASIC
    public double getBasic(){
        return basic;
    }
    public void setBasic(double basic){
        this.basic = basic;
    }

    //DISCOUNT
    public double getDiscount(){
        return discount;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }

}
