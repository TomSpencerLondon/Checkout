package com.tomspencerlondon.adapter.in.scanner;

import static org.assertj.core.api.Assertions.assertThat;
import com.tomspencerlondon.domain.Cart;
import org.junit.jupiter.api.Test;

public class ScannerTest {
  @Test
  void receiptShowsZeroPriceWhenNoItemsScanned() {
    Cart cart = new Cart();
    Scanner scanner = new Scanner(cart);

    assertThat(scanner.receipt()).isEqualTo("""
        Total Price: $0
        """);
  }
}
