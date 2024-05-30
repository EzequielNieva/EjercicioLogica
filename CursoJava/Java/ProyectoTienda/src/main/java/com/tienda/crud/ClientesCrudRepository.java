package com.tienda.crud;

import com.tienda.entidades.Clientes;
import org.springframework.data.repository.CrudRepository;


public interface ClientesCrudRepository extends CrudRepository<Clientes, Integer> {

}
