package com.tienda.domain.servicios;

import com.tienda.domain.Product;
import com.tienda.domain.repositorio.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public List<Product> findByCategory(int categoryId) {
        return productRepository.findByCategory(categoryId);
    }

    public Product findById(int id) {
        return productRepository.findById(id);
    }

    public boolean deleteById(int id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getScareStock(int idProduct) {
        return productRepository.getScarseProduct(idProduct);
    }
}
