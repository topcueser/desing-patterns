package com.esertopcu.dpatterns.facade;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class OrderFacade {

    private final OrderProcess orderProcess = new OrderProcess();

    public void createOrder(String customerName, String shippingCompanyName, List<CartItem> cartItems) {
        Customer customer = new Customer(customerName);
        ShippingCompany shippingCompany = new ShippingCompany(shippingCompanyName);
        int orderId = orderProcess.save(LocalDate.now(), customer, shippingCompany);
        orderProcess.addCartItems(orderId, cartItems);
        System.out.println();
        System.out.println("Completed");
    }
}
