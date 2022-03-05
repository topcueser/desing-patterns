package com.esertopcu.dpatterns.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductWithBuilder {

    private String name;
    private String description;
    private LocalDateTime date;
    private Boolean inStock;
    private BigDecimal price;

    public static class Builder {

        private String name;
        private String description;
        private LocalDateTime date;
        private Boolean inStock;
        private BigDecimal price;

        public Builder name(String buildName) {
            this.name = buildName;
            return this;
        }

        public Builder description(String buildDescription) {
            this.description = buildDescription;
            return this;
        }

        public Builder date(LocalDateTime buildDate) {
            this.date = buildDate;
            return this;
        }

        public Builder inStock(Boolean buildInStock) {
            this.inStock = buildInStock;
            return this;
        }

        public Builder price(BigDecimal buildPrice) {
            this.price = buildPrice;
            return this;
        }

        public ProductWithBuilder build() {
            return new ProductWithBuilder(this);
        }
    }

    // private constructor
    private ProductWithBuilder(Builder builder) {
        name = builder.name;
        description = builder.description;
        date = builder.date;
        inStock = builder.inStock;
        price = builder.price;
    }

    @Override
    public String toString() {
        return "Builder Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", inStock=" + inStock +
                ", price=" + price +
                '}';
    }
}
