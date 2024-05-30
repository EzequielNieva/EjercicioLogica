package com.tienda.repository;

import com.tienda.crud.CategoriasCrudRepository;
import com.tienda.domain.Category;
import com.tienda.domain.repositorio.CategoryRepository;
import com.tienda.entidades.Categorias;
import com.tienda.mappers.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriasRepository implements CategoryRepository {

    @Autowired
    private CategoriasCrudRepository categoriasCrudRepository;

    @Autowired
    private CategoryMapper mapper;

    @Override
    public List<Category> getAll() {
        List<Categorias> categorias = (List<Categorias>) categoriasCrudRepository.findAll();
        return mapper.toCategorys(categorias);
    }

    @Override
    public List<Category> findByCategory(int categoryId) {
        List<Categorias> categorias = (List<Categorias>) categoriasCrudRepository.findByIdCategoria(categoryId);
        return mapper.toCategorys(categorias);
    }

    @Override
    public Category findById(int id) {
        return mapper.toCategory(categoriasCrudRepository.findById(id));
    }

    @Override
    public Category save(Category category) {
        Categorias categoria = mapper.categoria(category);
        return mapper.toCategory(categoriasCrudRepository.save(categoria));
    }

    @Override
    public void deleteById(int id) {categoriasCrudRepository.deleteById(id);
    }

    @Override
    public boolean existsById(int id) {
        return categoriasCrudRepository.existsById(id);
    }
}
