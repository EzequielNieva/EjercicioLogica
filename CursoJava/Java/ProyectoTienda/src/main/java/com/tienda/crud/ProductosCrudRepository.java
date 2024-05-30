package com.tienda.crud;

import com.tienda.entidades.Productos;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ProductosCrudRepository extends CrudRepository<Productos, Integer> {
    
    List<Productos> findByIdCategoria(int id);
    
    List<Productos> findByCantidadStockLessThan(int cantidad);

    Productos findByIdProducto(int id);
}
