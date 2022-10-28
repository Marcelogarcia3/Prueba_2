package GestorPersonal;
public class Correo_Electronico {
	private String direccionCorreoElectronico;
	private String provedorCorreo;

	public String getDireccionCorreoElectronico() {
		return this.direccionCorreoElectronico;
	}

	public void setDireccionCorreoElectronico(String direccionCorreoElectronico) {
		this.direccionCorreoElectronico = direccionCorreoElectronico;
	}

	public String getProvedorCorreo() {
		return this.provedorCorreo;
	}

	public void setProvedorCorreo(String provedorCorreo) {
		this.provedorCorreo = provedorCorreo;
	}

	public Correo_Electronico(String direccionCorreoElectronico, String provedorCorreo) {
		this.direccionCorreoElectronico = direccionCorreoElectronico;
		this.provedorCorreo = provedorCorreo;
	}
}