package com.tienda.entidades;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="compras")
public class Compras {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_compra")
    private Integer idCompra;
    
    @Column(name="id_cliente")
    private Integer idCliente;
    
    private LocalDateTime fecha;
    
    @Column(name="medio_pago")
    private String medioPago;
    
    private String comentario;
    
    private Boolean estado;
            
    @OneToMany(mappedBy="compras")
    private List<ComprasProductos> productos;
    
    @ManyToOne
    @JoinColumn(name="id_cliente",insertable = false , updatable=false)
    private Clientes clientes;
}
