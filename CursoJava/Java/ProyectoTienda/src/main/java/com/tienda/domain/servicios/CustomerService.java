package com.tienda.domain.servicios;

import com.tienda.domain.Category;
import com.tienda.domain.Customer;
import com.tienda.domain.repositorio.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAll(){
        return customerRepository.getAll();
    }

    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    public boolean deleteById(int id){
        if(customerRepository.existsById(id)){
            customerRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }
}
