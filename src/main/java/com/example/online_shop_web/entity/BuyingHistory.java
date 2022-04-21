package com.example.online_shop_web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table (name = "buyingHistory")
public class BuyingHistory {
    @Id
    @Column (name = "id")
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    public BuyingHistory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "BuyingHistory{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
}
