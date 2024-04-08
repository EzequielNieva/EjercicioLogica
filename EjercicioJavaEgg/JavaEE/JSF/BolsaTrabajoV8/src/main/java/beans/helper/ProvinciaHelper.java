package beans.helper;

import beans.model.Provincia;
import java.util.*;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@RequestScoped
@Named
public class ProvinciaHelper {
    
    public List<Provincia> getProvincia(){
        
        List<Provincia> provincias = new ArrayList<>();
        
        int provinciaId = 1;
        Provincia provincia  = new Provincia(provinciaId++,"Salta",4400);
        provincias.add(provincia);
        
        provincia  = new Provincia(provinciaId++,"Tucuman",4000);
        provincias.add(provincia);
        
        provincia  = new Provincia(provinciaId++,"Jujuy",4600);
        provincias.add(provincia);
        
        provincia  = new Provincia(provinciaId++,"Chaco",3500);
        provincias.add(provincia);
        
        return provincias;
    }
    
    public int getProvinciaIdPorNombre(String nombreProvincia){
        int provinciaId=0;
        List<Provincia> provincias = this.getProvincia();
        
        for (Provincia provincia : provincias) {
            if(provincia.getNombreProvincia().equals(nombreProvincia)){
                provinciaId= provincia.getProvinciaId();
                break;
            }
        }
        
        return provinciaId;
    }
    
    public int getProvinciaIdPorCP(int codigoPostal){
        int provinciaId = 0;
        List<Provincia> provincias = this.getProvincia();
        for (Provincia provincia : provincias) {
            if(provincia.getCodigoPostal() == codigoPostal){
                provinciaId = provincia.getProvinciaId();
                break;
            }
        }
        return provinciaId;
    }
    
    public List<SelectItem> getSelectItems(){
        List<SelectItem> selectItems = new ArrayList<>();
        List<Provincia> provincias  = this.getProvincia();
        for (Provincia provincia : provincias) {
            SelectItem selectItem = new SelectItem(provincia.getProvinciaId(),provincia.getNombreProvincia());
            selectItems.add(selectItem);
        }
        return selectItems;
    }
}
