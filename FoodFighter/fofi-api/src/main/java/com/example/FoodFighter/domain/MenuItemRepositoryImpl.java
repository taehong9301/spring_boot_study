package com.example.FoodFighter.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MenuItemRepositoryImpl implements MenuItemRepository {

  private List<MenuItem> menuItems = new ArrayList<>();

  public MenuItemRepositoryImpl() {
    menuItems.add(new MenuItem("Pizza"));
  }

  @Override
  public List<MenuItem> findAllByRestaurantId(Long id) {
    return menuItems;
  }
}
