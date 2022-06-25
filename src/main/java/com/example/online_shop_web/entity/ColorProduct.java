package com.example.online_shop_web.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "color_product")
public class ColorProduct {
    @Id
    @Column (name = "id_color")
    private Long id;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column (name = "name_color")
    private String nameColor;

    public ColorProduct() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }
}
