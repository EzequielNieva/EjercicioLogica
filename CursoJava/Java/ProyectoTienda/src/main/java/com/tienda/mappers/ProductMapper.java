package com.tienda.mappers;

import com.tienda.domain.Product;
import com.tienda.entidades.Productos;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "idProducto",target = "productId"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "idCategoria",target = "categoryId"),
            @Mapping(source = "categorias",target = "category"),
            @Mapping(source = "cantidadStock",target = "stock"),
            @Mapping(source = "codigoBarras",target = "barCode"),
            @Mapping(source = "precioVenta",target = "price"),
            @Mapping(source = "estado",target = "state"),
    })
    Product toProduct(Productos producto);

    List<Product> toProducts(List<Productos> productos);

    @InheritInverseConfiguration

    Productos producto(Product product);
}
