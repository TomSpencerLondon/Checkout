package com.tomspencerlondon.domain;

public class Cart {

  private int productPrice;

  public int totalPrice() {
    return productPrice;
  }

  public void add(String productName, int productPrice) {
    this.productPrice += productPrice;
  }
}
