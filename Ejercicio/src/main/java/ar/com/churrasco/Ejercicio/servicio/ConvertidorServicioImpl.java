package ar.com.churrasco.Ejercicio.servicio;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class ConvertidorServicioImpl implements ConvertidorServicio {

	@Override
	public String convertirMensaje(HashMap<Integer, String> trama) {
		return "4000001000000000171234657890123456720201005";
	}
	
	private void identificarCampos (HashMap<Integer, String> trama) {
		
	}
	
}
