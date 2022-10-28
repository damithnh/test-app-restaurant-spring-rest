package com.example.demo.controllers;

import com.example.demo.entities.Order;
import com.example.demo.entities.Restaurant;
import com.example.demo.repos.RestaurantRepository;
import com.example.demo.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @RequestMapping("/restaurants")
    public List<Restaurant> getRestaurants (){
        return restaurantService.getRestaurants();
    }

    @RequestMapping("/restaurants/{id}")
    public Restaurant getRestaurants (@PathVariable String id){
        return restaurantService.getRestaurant(id);
    }

    @RequestMapping("/orders")
    public List<Order> getOrders (){
        return restaurantService.getOrders();
    }

    @RequestMapping("/orders/{id}")
    public Order getOrder (@PathVariable String id){
        return restaurantService.getOrder(id);
    }


}
