package com.example.online_shop_web.controller;

import com.example.online_shop_web.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/homepage")
    public String showHomePage(Model model) {
        model.addAttribute("categorys", categoryRepository.findAll());
        return "HomePage";
    }
}
