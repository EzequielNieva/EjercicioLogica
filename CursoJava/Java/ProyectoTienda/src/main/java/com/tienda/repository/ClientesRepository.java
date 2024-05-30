package com.tienda.repository;

import com.tienda.crud.ClientesCrudRepository;
import com.tienda.domain.Customer;
import com.tienda.domain.repositorio.CustomerRepository;
import com.tienda.entidades.Clientes;
import com.tienda.mappers.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientesRepository implements CustomerRepository {

    @Autowired
    private ClientesCrudRepository clientesCrudRepository;

    @Autowired
    private CustomerMapper mapper;

    @Override
    public List<Customer> getAll() {
        List<Clientes> clientes = (List<Clientes>) clientesCrudRepository.findAll();
        return mapper.toCustomers(clientes);
    }

    @Override
    public Customer findById(int id) {
        Optional<Clientes> cliente = clientesCrudRepository.findById(id);
        return cliente.map(mapper::toCustomer).orElse(null);
    }

    @Override
    public Customer save(Customer customer) {
        Clientes cliente = mapper.toCliente(customer);
        return mapper.toCustomer(clientesCrudRepository.save(cliente));
    }

    @Override
    public void deleteById(int id) {
        clientesCrudRepository.deleteById(id);
    }

    @Override
    public boolean existsById(int id) {
        return clientesCrudRepository.existsById(id);
    }
}
