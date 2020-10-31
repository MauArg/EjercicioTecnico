package ar.com.churrasco.Ejercicio.entidad;

public class Campo {
	private byte nroCampo;
	private String trama;

	// Constructor vacío
	public Campo() {
	}

	public Campo(byte nroCampo, String trama) {
		this.nroCampo = nroCampo;
		this.trama = trama;
	}

	public byte getNroCampo() {
		return nroCampo;
	}

	public void setNroCampo(byte nroCampo) {
		this.nroCampo = nroCampo;
	}

	public String getTrama() {
		return trama;
	}

	public void setTrama(String trama) {
		this.trama = trama;
	}

}
