package com.example.online_shop_web.repository;

import com.example.online_shop_web.entity.Category;
import com.example.online_shop_web.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
}
