package com.example.firebaseshopp;

import java.security.PublicKey;

public class productList {



    String id;
    String name;
    String price;

    public productList(){
    }

    public productList(String id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
        //this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
