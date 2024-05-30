package com.tienda.web.controller;


import com.tienda.domain.Category;
import com.tienda.domain.servicios.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public String getAll(Model model) {
        List<Category> categorys = categoryService.getAll();
        model.addAttribute("categorys", categorys);
        return "categoriaTabla";
    }

    @GetMapping("/crearCategoria")
    public String mostrarFormularioCrearCategoria(Model model) {
        model.addAttribute("newCategory", new Category());
        return "crearCategoria";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("category") Category category) {
        categoryService.save(category);
        return "redirect:/category/all";
    }

    @DeleteMapping("/delete/{categoryId}")
    @ResponseBody
    public ResponseEntity<Void> delete(@PathVariable("categoryId") int categoryId) {
        boolean deleted = categoryService.deleteById(categoryId);
        if (deleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }
}

