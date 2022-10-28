import java.util.ArrayList;
import java.util.List;

public class GestorPersonal {

    private List<Persona>personas;

    public GestorPersonal(){
        this.personas = new ArrayList<>();
    }

    public Persona buscarPersona(int rut, String nombre, String apellido){
        for(Persona persona : this.personas){
            if(persona.getNombre().equals(nombre) && persona.getRut().equals(rut) && persona.getApellido().equals(apellido)){
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


}
