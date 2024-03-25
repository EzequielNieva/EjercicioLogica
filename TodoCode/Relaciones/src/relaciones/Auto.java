package relaciones;

import java.util.List;

public class Auto {
    
    private Long id;
    private String marca;
    private String modelo;
    
    // private Propietario prop; relacion 1 a 1.
    private List<Propietario> listaProp; // relacion 1 a n.
    
    
    
    public Auto() {
    }

    public Auto(Long id, String marca, String modelo, List<Propietario> listaProp) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaProp = listaProp;
    }

    public List<Propietario> getListaProp() {
        return listaProp;
    }

    public void setListaProp(List<Propietario> listaProp) {
        this.listaProp = listaProp;
    }

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", listaProp=" + listaProp + '}';
    }
    
    
    
}
