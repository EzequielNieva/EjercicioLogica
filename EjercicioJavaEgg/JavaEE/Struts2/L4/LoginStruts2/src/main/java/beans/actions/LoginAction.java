package beans.actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class LoginAction extends ActionSupport {
    
    Logger log = LogManager.getLogger(LoginAction.class);
    
    private String nombre;
    
    public String execute(){
        log.info("El nombre es:" + this.nombre);
        return SUCCESS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo(){
        return getText("persona.titulo");
    }
    
    public String getValor(){
        return getText("persona.valor");
    }
    
    public String getBoton(){
        return getText("persona.boton");
    }
}

