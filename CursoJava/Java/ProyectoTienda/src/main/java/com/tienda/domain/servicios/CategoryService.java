package com.tienda.domain.servicios;

import com.tienda.domain.Category;
import com.tienda.domain.repositorio.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.getAll();
    }

    public List<Category> findByCategory(int categoryId){
        return categoryRepository.findByCategory(categoryId);
    }

    public Category findById(int id){
        return categoryRepository.findById(id);
    }

    public boolean deleteById(int id){
        if(categoryRepository.existsById(id)){
            categoryRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Category save(Category category){
        return categoryRepository.save(category);
    }
}
