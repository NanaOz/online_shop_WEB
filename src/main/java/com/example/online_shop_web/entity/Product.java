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

    @Column(name = "old_price")
    private double oldPrice;

    @Lob @Type(type = "org.hibernate.type.IntegerType")
    @Column (name = "rating")
    private int rating;

    @Column(name = "new_product")
    private Boolean newProduct;

    @Column(name = "hot_product")
    private Boolean hotProduct;

    private String image;

    @Column(length = 65535)
    @Lob @Type(type = "org.hibernate.type.TextType")
    private String description;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "category_id")
    private Category category;

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

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Boolean getNewProduct() {
        return newProduct;
    }

    public void setNewProduct(Boolean newProduct) {
        this.newProduct = newProduct;
    }

    public Boolean getHotProduct() {
        return hotProduct;
    }

    public void setHotProduct(Boolean hotProduct) {
        this.hotProduct = hotProduct;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
