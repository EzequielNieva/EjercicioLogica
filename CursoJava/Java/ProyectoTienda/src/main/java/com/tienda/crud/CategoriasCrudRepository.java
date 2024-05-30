package com.tienda.crud;

import com.tienda.entidades.Categorias;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoriasCrudRepository extends CrudRepository<Categorias,Integer> {

    List<Categorias> findByIdCategoria(int id);

    Categorias findById(int id);
}
