package com.example.FoodFighter.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

  private Long id;
  private String name;
  private String address;
  private List<MenuItem> menuItems = new ArrayList<>();

  public Restaurant(String name) {
    this.name = name;
  }

  public Restaurant(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public Restaurant(Long id, String name, String address) {
    this.id = id;
    this.name = name;
    this.address = address;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public String getInformation() {
    return name + " in " + address;
  }

  public List<MenuItem> getMenuItems() {
    return menuItems;
  }

  public void addMenuItem(MenuItem menuItem) {
    menuItems.add(menuItem);
  }

  public void setMenuItems(List<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }
}
