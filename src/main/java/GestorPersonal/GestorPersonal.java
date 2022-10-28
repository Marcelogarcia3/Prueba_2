package GestorPersonal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GestorPersonal {

    private List<Persona>personas;

    public GestorPersonal(){
        this.personas = new ArrayList<>();
    }

    public Persona buscarPersona(int rut, String nombre, String apellido){
        for(Persona persona : this.personas){
            if(persona.getNombre().equals(nombre) && persona.getRut()==(rut) && persona.getApellido().equals(apellido)){
                return persona;
            }
        }
        return null;
    }


    public boolean agregarPersona(Persona persona){
        if(buscarPersona(persona.getRut(),persona.getNombre(),persona.getApellido()) == null){
            this.personas.add(persona);
            return true;
        }
        else{
            return false;
        }
    }
    public List mostrarPersonaRut(int rut){
        ArrayList<Persona> personas = new ArrayList<>();
        for(Persona persona : this.personas){
            if(persona.getRut()==(rut)){
                System.out.println(persona.toString());
            }
        }
        return personas;
    }



    public List mostrarPersonaMarca(Persona persona){
        ArrayList<Persona> personas = new ArrayList<>();
        for(Persona persona : this.personas){
            if(Automovil.getMarca().equals(marca)){
                System.out.println(persona.toString());
            }
        }
        return personas;
    }



}
