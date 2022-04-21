package com.example.online_shop_web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "basket")
public class Basket {
    @Id
    @Column(name = "id")
    private Long id;

    public Basket() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                '}';
    }
}
