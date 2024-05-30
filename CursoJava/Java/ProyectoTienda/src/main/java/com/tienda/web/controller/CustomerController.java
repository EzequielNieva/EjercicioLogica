package com.tienda.web.controller;


import com.tienda.domain.Customer;
import com.tienda.domain.servicios.CustomerService;
import com.tienda.entidades.Clientes;
import com.tienda.mappers.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerMapper customerMapper;

    @GetMapping("/all")
    public String getAll(Model model) {
        List<Customer> clientes = customerService.getAll();
        model.addAttribute("clientes", clientes);
        return "clienteTabla";
    }

    @GetMapping("/crearCliente")
    public String mostrarFormularioCrearCliente(Model model) {
        model.addAttribute("newCustomer", new Customer());
        return "crearCliente";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("newCustomer") Customer customer) {
        customerService.save(customer);
        return "redirect:/customer/all";
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        boolean deleted = customerService.deleteById(id);
        if (deleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
