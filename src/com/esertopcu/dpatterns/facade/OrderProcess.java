package com.esertopcu.dpatterns.facade;

import java.time.LocalDate;
import java.util.List;

public class OrderProcess {

    public int save(LocalDate date, Customer customer, ShippingCompany shippingCompany) {
        String description = String.format("Order Date: %s , Customer Name: %s , Shipping Company: %s",
                date, customer.getName(), shippingCompany.getName());
        System.out.println(description);
        return 1;
    }

    public void addCartItems(int orderId, List<CartItem> cartItems) {
        System.out.println("Items received in order number: " + orderId);
        System.out.println(".............................");
        cartItems.forEach(cartItem -> {
            System.out.println(cartItem.toString());
        });
        System.out.println(".............................");
        double total = cartItems.stream()
                .mapToDouble(CartItem::getPrice)
                .sum();
        System.out.println("Total: " + total);
    }
}
