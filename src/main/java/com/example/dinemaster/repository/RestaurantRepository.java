package com.example.dinemaster.repository;

import java.util.ArrayList;
import com.example.dinemaster.model.Restaurant;

public interface RestaurantRepository {

    ArrayList<Restaurant> getRestaurants();

    Restaurant addRestaurant(Restaurant restaurant);

    Restaurant getRestaurantById(int id);

    Restaurant updateRestaurant(int id, Restaurant restaurant);

    void deleteRestaurant(int id);

}