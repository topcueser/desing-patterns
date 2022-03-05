package com.esertopcu.dpatterns.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

//POJO
public class Product {

    private String name;
    private String description;
    private LocalDateTime date;
    private Boolean inStock;
    private BigDecimal price;

    public Product() {

    }

    public Product(String name, String description, LocalDateTime date, Boolean inStock, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.inStock = inStock;
        this.price = price;
    }

    public Product(String name, Boolean inStock, BigDecimal price) {
        this.name = name;
        this.inStock = inStock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Basic Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", inStock=" + inStock +
                ", price=" + price +
                '}';
    }
}
