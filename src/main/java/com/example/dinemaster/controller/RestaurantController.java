package com.example.dinemaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.dinemaster.model.Restaurant;
import com.example.dinemaster.service.RestaurantJpaService;

@RestController
public class RestaurantController {
    @Autowired
    private RestaurantJpaService restaurantService;

    @GetMapping("/restaurants")
    public ArrayList<Restaurant> getRestaurants() {
        return restaurantService.getRestaurants();
    }

    @GetMapping("/restaurants/{restaurantId}")

    public Restaurant getRestaurantById(@PathVariable("restaurantId") int id) {
        return restaurantService.getRestaurantById(id);
    }

    @PostMapping("/restaurants")

    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }

    @PutMapping("restaurants/{restaurantId}")

    public Restaurant updateRestaurant(@PathVariable("restaurantId") int id, @RequestBody Restaurant restaurant) {
        return restaurantService.updateRestaurant(id, restaurant);
    }

    @DeleteMapping("restaurants/{restaurantId}")

    public void deleteRestaurant(@PathVariable("restaurantId") int id) {
        restaurantService.deleteRestaurant(id);
    }

}