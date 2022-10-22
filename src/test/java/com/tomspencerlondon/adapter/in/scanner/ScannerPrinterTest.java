package com.tomspencerlondon.adapter.in.scanner;

import static org.assertj.core.api.Assertions.assertThat;
import com.tomspencerlondon.domain.Cart;
import org.junit.jupiter.api.Test;

public class ScannerPrinterTest {
  @Test
  void receiptShowsZeroPriceWhenNoItemsScanned() {
    Cart cart = new Cart();
    ScannerPrinter scannerPrinter = new ScannerPrinter(cart);

    assertThat(scannerPrinter.receipt()).isEqualTo("""
        Total Price: $0
        """);
  }

  @Test
  void receiptShowsItemAndPriceForOneItemScanned() {
    Cart cart = new Cart();
    ScannerPrinter scannerPrinter = new ScannerPrinter(cart);

    cart.add("Toothbrush", 1);

    assertThat(scannerPrinter.receipt()).isEqualTo("""
        Toothbrush $1

        Total Price: $1
        """);
  }

  @Test
  void receiptShowsMultipleItemNamesAndPricesAndTotal() {
    Cart cart = new Cart();
    ScannerPrinter scannerPrinter = new ScannerPrinter(cart);


    cart.add("Toothpaste", 2);

    assertThat(scannerPrinter.receipt()).isEqualTo("""
        Toothpaste $2

        Total Price: $2
        """);
  }
}
