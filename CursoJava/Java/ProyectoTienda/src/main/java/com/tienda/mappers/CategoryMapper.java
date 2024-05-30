package com.tienda.mappers;

import com.tienda.domain.Category;
import com.tienda.entidades.Categorias;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria",target = "categoryId"),
            @Mapping(source = "estado",target = "state"),
            @Mapping(source = "descripcion",target = "description"),
    })
    Category toCategory(Categorias categoria);

    List<Category> toCategorys(List<Categorias> categorias);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categorias categoria(Category category);
}
