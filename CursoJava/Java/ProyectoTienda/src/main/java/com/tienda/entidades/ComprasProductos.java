package com.tienda.entidades;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="compras_productos")
public class ComprasProductos {
    
    @EmbeddedId
    private ComprasProductosPK id;
    
    private Integer cantidad;
    
    private Integer total;
    
    private Boolean estado;
    
    @ManyToOne
    @JoinColumn(name="id_producto",insertable = false, updatable=false)
    private Productos producto;
    
    @ManyToOne
    @JoinColumn(name="id_compra",insertable = false, updatable=false)
    private Compras compras;

}
