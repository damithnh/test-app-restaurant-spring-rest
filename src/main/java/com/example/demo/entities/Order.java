package com.example.demo.entities;


import java.util.List;

public class Order extends ParentClass {

    private List<RestaurantItem> restaurantItemList;

    public Order(String id, String name) {
        super(id, name);
    }

    public List<RestaurantItem> getRestaurantItemList() {
        return restaurantItemList;
    }

    public void setRestaurantItemList(List<RestaurantItem> restaurantItemList) {
        this.restaurantItemList = restaurantItemList;
    }
}
