package GestorPersonal;
public class Chasis {
	private int numeroChasis;
	private String tipoMaterial;

	public int getNumeroChasis() {
		return this.numeroChasis;
	}

	public void setNumeroChasis(int numeroChasis) {
		this.numeroChasis = numeroChasis;
	}

	public String getTipoMaterial() {
		return this.tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public Chasis(int numeroChasis, String tipoMaterial) {
		this.numeroChasis = numeroChasis;
		this.tipoMaterial = tipoMaterial;
	}
}