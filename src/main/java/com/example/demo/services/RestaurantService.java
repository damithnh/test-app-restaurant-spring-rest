package com.example.demo.services;

import com.example.demo.entities.Order;
import com.example.demo.entities.Restaurant;
import com.example.demo.entities.RestaurantItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RestaurantService {

    private List<Restaurant> restaurantList = new ArrayList<>();
    private List<Order> orderList = new ArrayList<>();


    public RestaurantService() {
        Restaurant restaurant1 = new Restaurant("r001", "Restaurant 1");
        Restaurant restaurant2 = new Restaurant("r002", "Restaurant 1");

        List<RestaurantItem> restaurantItemsList1 = Arrays.asList(
                new RestaurantItem("ri001", "Restaurant Item 1"),
                new RestaurantItem("ri002", "Restaurant Item 2"),
                new RestaurantItem("ri003", "Restaurant Item 3"),
                new RestaurantItem("ri004", "Restaurant Item 4")
        );

        List<RestaurantItem> restaurantItemsList2 = Arrays.asList(
                new RestaurantItem("ri005", "Restaurant Item 5"),
                new RestaurantItem("ri006", "Restaurant Item 6"),
                new RestaurantItem("ri007", "Restaurant Item 7"),
                new RestaurantItem("ri008", "Restaurant Item 8")
        );

        restaurant1.setRestuarantItems(restaurantItemsList1);
        restaurant2.setRestuarantItems(restaurantItemsList2);

        Order order1 = new Order("order001", "Order 1");
        Order order2 = new Order("order002", "Order 2");

        List<RestaurantItem> orderItemsList1 = Arrays.asList(
                new RestaurantItem("oi001", "Restaurant Item 1"),
                new RestaurantItem("oi002", "Restaurant Item 4")
        );

        List<RestaurantItem> orderItemsList2 = Arrays.asList(
                new RestaurantItem("oi003", "Restaurant Item 5"),
                new RestaurantItem("oi004", "Restaurant Item 6")
        );

        order1.setRestaurantItemList(orderItemsList1);
        order2.setRestaurantItemList(orderItemsList2);

        restaurantList.add(restaurant1);
        restaurantList.add(restaurant2);

        orderList.add(order1);
        orderList.add(order2);
    }


    public List<Restaurant> getRestaurants (){
        return restaurantList;
    }

    public Restaurant getRestaurant(String id) {
        return restaurantList.stream().filter(restaurant -> restaurant.getId().equals(id)).findFirst().get();
    }

    public List<Order> getOrders (){
        return orderList;
    }

    public Order getOrder(String id) {
        return orderList.stream().filter(order -> order.getId().equals(id)).findFirst().get();
    }

}

