package com.esertopcu.dpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void addListProduct(List<Product> products) {
        productList.addAll(products);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public double calculateTotalPrice() {
        return productList.stream().mapToDouble(Product::getPrice).sum();
    }

    public void payment(PaymentMethod payment) {
        payment.pay(calculateTotalPrice());
    }
}
