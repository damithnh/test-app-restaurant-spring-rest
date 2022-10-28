package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends ParentClass {

    private List<RestaurantItem> restuarantItems = new ArrayList<>();

    public Restaurant(String id, String name) {
        super(id, name);
    }

    public List<RestaurantItem> getRestuarantItems() {
        return restuarantItems;
    }

    public void setRestuarantItems(List<RestaurantItem> restuarantItems) {
        this.restuarantItems = restuarantItems;
    }

}
