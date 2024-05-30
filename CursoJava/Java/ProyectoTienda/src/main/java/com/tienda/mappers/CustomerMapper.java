package com.tienda.mappers;

import com.tienda.domain.Customer;
import com.tienda.entidades.Clientes;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellidos", target = "lastName"),
            @Mapping(source = "celular", target = "phone"),
            @Mapping(source = "direccion", target = "address"),
            @Mapping(source = "correoElectronico", target = "email")
    })
    Customer toCustomer(Clientes cliente);
    List<Customer> toCustomers(List<Clientes> clientes);

    @InheritInverseConfiguration
    Clientes toCliente(Customer customer);
}
