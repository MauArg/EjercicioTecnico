package ar.com.churrasco.Ejercicio.entidad;

import java.util.List;

public class MensajeEntrante {
	private String cabecera;
	private List<Campo> campos;

	public String getCabecera() {
		return cabecera;
	}

	public void setCabecera(String cabecera) {
		this.cabecera = cabecera;
	}

	public List<Campo> getCampos() {
		return campos;
	}

	public void setCampos(List<Campo> campos) {
		this.campos = campos;
	}

}
