package com.tienda.web.controller;

import com.tienda.domain.Product;
import com.tienda.domain.servicios.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public String getAll(Model model) {
        List<Product> products = productService.getAll();
        model.addAttribute("products", products);
        return "productoTabla";
    }

    @GetMapping("/category/{id}")
    public List<Product> findByCategory(@PathVariable("id") int categoryId) {
        return productService.findByCategory(categoryId);
    }

    @GetMapping("/{idProduct}")
    public Product findById(@PathVariable int idProduct) {
        return productService.findById(idProduct);
    }

    @GetMapping("/stock/{id}")
    public List<Product> getScareProduct(@PathVariable("id") int idProduct) {
        return productService.getScareStock(idProduct);
    }

    @GetMapping("/crearProducto")
    public String mostrarFormularioCrearProducto(Model model) {
        model.addAttribute("newProduct", new Product());
        return "crearProducto";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("product") Product product) {
        productService.save(product);
        return "redirect:/products/all";
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public ResponseEntity<Void> delete(@PathVariable("id") int productId) {
        boolean deleted = productService.deleteById(productId);
        if (deleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
