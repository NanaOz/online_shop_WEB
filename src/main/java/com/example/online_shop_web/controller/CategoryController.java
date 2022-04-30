package com.example.online_shop_web.controller;

import com.example.online_shop_web.entity.Category;
import com.example.online_shop_web.entity.Product;
import com.example.online_shop_web.repository.CategoryRepository;
import com.example.online_shop_web.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CategoryController {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    @Autowired
    public CategoryController(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }

    @GetMapping("/homepage")
    public String showHomePage(Model model) {
        model.addAttribute("categories", categoryRepository.findAll());
        return "Home";
    }

    @GetMapping("/catalog/{id}")
    public String showInfoForm(@PathVariable("id") long id, Model model) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("category", category);
        return "";
    }

    @GetMapping("/show")
    public String showProduct(Model model) {
        Iterable<Category> category = categoryRepository.findAll();
        Map<Category, List<Product>> map = new HashMap<>();
        category.forEach(type -> map.put(type, productRepository.findByCategory(type)));
        model.addAttribute("map", map);
        return "CategoryPage";
    }
}
