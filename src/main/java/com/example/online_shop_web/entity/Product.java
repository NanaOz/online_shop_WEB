package com.example.online_shop_web.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column (name = "id")
    private Long id;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column (name = "name")
    private String name;

    @Lob @Type(type = "org.hibernate.type.DoubleType")
    @Column (name = "price")
    private double price;

    @Lob @Type(type = "org.hibernate.type.IntegerType")
    @Column (name = "rating")
    private int rating;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
