package com.tomspencerlondon.adapter.in.scanner;

import com.tomspencerlondon.domain.Cart;

public class Scanner {

  private Cart cart;

  public Scanner(Cart cart) {
    this.cart = cart;
  }

  public String receipt() {
    return cart.receipt();
  }
}
