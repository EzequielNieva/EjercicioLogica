package com.tienda.domain.repositorio;

import com.tienda.domain.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> getAll();
    Customer findById(int id);
    Customer save(Customer customer);
    void deleteById(int id);
    boolean existsById(int id);
}
