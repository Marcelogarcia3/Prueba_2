package GestorPersonal;
import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private int rut;
	public ArrayList<Correo_Electronico> correo = new ArrayList<Correo_Electronico>();
	public ArrayList<Automovil> auto = new ArrayList<Automovil>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getRut() {
		return this.rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public Persona(String nombre, String apellido, int rut) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
	}

	public String toString() {
		return "Nombre: "+this.nombre+" "+this.apellido+", rut: "+this.rut;
	}
}