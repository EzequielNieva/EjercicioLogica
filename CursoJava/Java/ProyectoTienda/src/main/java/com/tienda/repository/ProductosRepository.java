package com.tienda.repository;

import com.tienda.crud.ProductosCrudRepository;
import com.tienda.domain.Product;
import com.tienda.domain.repositorio.ProductRepository;
import com.tienda.entidades.Productos;
import java.util.List;

import com.tienda.mappers.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductosRepository implements ProductRepository {

    @Autowired
    private ProductosCrudRepository productoCrudRepository;

    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
        List<Productos> productos = (List<Productos>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public List<Product> findByCategory(int categoryId) {
        List<Productos> productos = (List<Productos>) productoCrudRepository.findByIdCategoria(categoryId);
        return mapper.toProducts(productos);
    }

    @Override
    public Product findById(int id) {
        return mapper.toProduct(productoCrudRepository.findByIdProducto(id));
    }

    @Override
    public void deleteById(int id) {
        productoCrudRepository.deleteById(id);
    }

    @Override
    public boolean existsById(int id) {
        return productoCrudRepository.existsById(id);
    }

    @Override
    public List<Product> getScarseProduct(int productId) {
        List<Productos> productos = (List<Productos>) productoCrudRepository.findByCantidadStockLessThan(productId);
        return mapper.toProducts(productos);
    }

    @Override
    public Product save(Product product) {
        Productos producto = mapper.producto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }
}


