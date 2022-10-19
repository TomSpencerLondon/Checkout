package com.tomspencerlondon.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CartTest {

  @Test
  void emptyCartHasTotalPriceOfZero() {
     Cart cart = new Cart();

     assertThat(cart.totalPrice())
         .isZero();
  }

  @Test
  void addToothbrushProductThenCartTotalPriceIsOneDollar() {
    Cart cart = new Cart();
    cart.add("Toothbrush", 1);

    assertThat(cart.totalPrice())
        .isEqualTo(1);
  }
}
