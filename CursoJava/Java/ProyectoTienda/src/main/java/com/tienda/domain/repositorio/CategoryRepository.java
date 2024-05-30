package com.tienda.domain.repositorio;

import com.tienda.domain.Category;

import java.util.List;

public interface CategoryRepository {

    List<Category> getAll();
    List<Category> findByCategory(int categoryId);
    Category findById(int id);
    Category save(Category category);
    void deleteById(int id);
    boolean existsById(int id);
}
