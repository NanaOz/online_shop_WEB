package com.example.online_shop_web.controller;

import com.example.online_shop_web.entity.Category;
import com.example.online_shop_web.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CategoryController {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/homepage")
    public String showHomePage(Model model) {
        model.addAttribute("categories", categoryRepository.findAll());
        return "HomePage";
    }

    @GetMapping("/catalog/{id}")
    public String showInfoForm(@PathVariable("id") long id, Model model) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("category", category);
        return "";
    }
}
