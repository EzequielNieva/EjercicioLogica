package test;

import domain.Persona;
import java.util.List;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class TestPersonaServiceRS {
    
    private static final String URL_BASE="http://ezequiel:8080/sga-jee-web10/webservice";
    private static Client cliente;
    private static WebTarget webTarget;
    private static Persona persona;
    private static List<Persona> personas;
    private static Invocation.Builder invocationBuilder;
    private static Response response;
    
    
    public static void main(String[] args) {
         HttpAuthenticationFeature feature = HttpAuthenticationFeature.basicBuilder().nonPreemptive().credentials("admin", "admin").build();
        
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.register(feature);
        
        cliente = ClientBuilder.newClient(clientConfig);

        //cliente = ClientBuilder.newClient();-sga-jee-web9.
        
        //Leer una persona(Metodo GET)
        webTarget = cliente.target(URL_BASE).path("/personas");
        //Proporcionamos un id valido
        persona = webTarget.path("/1").request(MediaType.APPLICATION_XML).get(Persona.class);
        System.out.println("Persona recuperada: " + persona);
        
        //Leer todas las persona
        personas = webTarget.request(MediaType.APPLICATION_XML).get(Response.class).readEntity(new GenericType<List<Persona>>(){});
        System.out.println("\nPersonas recuperadas");
        imprimirPersonas(personas);
        
        //Agregar una persona
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre("Carlos");
        nuevaPersona.setApellido("Mendez");
        nuevaPersona.setEmail("cmendez3@gmail.com");
        nuevaPersona.setTelefono("321987");
        
        invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
        response = invocationBuilder.post(Entity.entity(nuevaPersona, MediaType.APPLICATION_XML));
        System.out.println("");
        System.out.println(response.getStatus());
        
        //recuperamos la persona recien agregada para despue modificar y eliminar
        
        Persona personaRecuperada = response.readEntity(Persona.class);
        System.out.println("persona agregada= " + personaRecuperada);
        
        Persona personaModificar = personaRecuperada;
        personaModificar.setApellido("Ramirez");
        String pathId= "/" + personaModificar.getIdPersona();
        invocationBuilder = webTarget.path(pathId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.put(Entity.entity(personaModificar, MediaType.APPLICATION_XML));
        System.out.println("");
        System.out.println("response = " + response.getStatus());
        System.out.println("Persona modificada = " + response.readEntity(Persona.class));
        
        Persona personaEliminar = personaRecuperada;
        String pathEliminarId = "/" + personaEliminar.getIdPersona();
        invocationBuilder=webTarget.path(pathEliminarId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.delete();
        System.out.println("");
        System.out.println("response: " + response.getStatus());
        System.out.println("Persona Eliminada: " + personaEliminar);
    }

    private static void imprimirPersonas(List<Persona> personas) {
        for (Persona persona1 : personas) {
            System.out.println("Persona = " + persona1);
        }
    }
}
