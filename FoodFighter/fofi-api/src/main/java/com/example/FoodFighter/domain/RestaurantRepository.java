package com.example.FoodFighter.domain;

import java.util.List;

public interface RestaurantRepository {
  List<Restaurant> findAll();

  Restaurant findById(Long id);
}
