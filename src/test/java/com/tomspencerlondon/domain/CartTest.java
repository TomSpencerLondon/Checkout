package com.tomspencerlondon.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CartTest {

  @Test
  void emptyCartHasTotalPriceOfZero() {
    Cart cart = new Cart();

    assertThat(cart.totalPrice()).isZero();
  }

  @Test
  void addToothbrushProductThenCartTotalPriceIsOneDollar() {
    Cart cart = new Cart();
    cart.add("Toothbrush", 1);

    assertThat(cart.totalPrice()).isEqualTo(1);
  }

  @Test
  void addTwoToothbrushesThenTotalPriceIsTwoDollars() {
    Cart cart = new Cart();

    cart.add("Toothbrush", 1);
    cart.add("Toothbrush", 1);

    assertThat(cart.totalPrice()).isEqualTo(2);
  }

  @Test
  void addTwoDifferentItemsThenTotalPriceIsSum() {
    Cart cart = new Cart();

    cart.add("Toothbrush", 1);
    cart.add("Toothpaste", 2);

    assertThat(cart.totalPrice()).isEqualTo(3);
  }

  @Test
  void emptyCartReceiptShowsZeroPrice() {
    Cart cart = new Cart();

    assertThat(cart.receipt()).isEqualTo("""
        Total Price: $0
        """);
  }

  @Test
  void cartWithItemThenReceiptShowsItemAndPrice() {
    Cart cart = new Cart();

    cart.add("Toothbrush", 1);

    assertThat(cart.receipt()).isEqualTo("""
        Toothbrush $1

        Total Price: $1
        """);
  }
}
