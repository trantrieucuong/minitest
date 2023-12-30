package com.example.minitest1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    private Integer id;
    private String name;
    private String description;
    private String thumbnail;
    private Integer price;
    private Double rating;
    private Integer priceDiscount;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", priceDiscount=" + priceDiscount +
                '}';
    }
}
