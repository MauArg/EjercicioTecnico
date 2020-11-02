package ar.com.churrasco.Ejercicio.controlador;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.churrasco.Ejercicio.servicio.ConvertidorServicioImpl;

@RestController
public class ConvertidorControlador {

	@Autowired
	ConvertidorServicioImpl servicio;

	@PostMapping("/convertidor-mensajes")
	public String convertirMensaje(@RequestBody HashMap<Integer, String> valores) {
		return servicio.convertirMensaje(valores);
	}

}
