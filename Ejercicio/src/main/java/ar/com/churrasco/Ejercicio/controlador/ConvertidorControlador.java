package ar.com.churrasco.Ejercicio.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertidorControlador {

	@PostMapping("/convertidor-mensajes")
	public String convertirMensaje() {
		return "4000001000000000171234657890123456720201005";
	}

}
