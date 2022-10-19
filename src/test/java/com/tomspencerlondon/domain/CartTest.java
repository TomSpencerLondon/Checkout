package com.tomspencerlondon.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CartTest {

  @Test
  void emptyCartHasTotalPriceOfZero() {
     Cart cart = new Cart();

     assertThat(cart.totalPrice())
         .isZero();
  }
}
