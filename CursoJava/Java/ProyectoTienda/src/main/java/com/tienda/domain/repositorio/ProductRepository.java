package com.tienda.domain.repositorio;

import com.tienda.domain.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAll();

    List<Product> findByCategory(int categoryId);

    Product findById(int id);

    void deleteById(int id);

    boolean existsById(int id);

    List<Product> getScarseProduct(int productId);

    Product save(Product product);
}
