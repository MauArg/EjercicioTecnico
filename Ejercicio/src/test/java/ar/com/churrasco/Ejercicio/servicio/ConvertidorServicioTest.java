package ar.com.churrasco.Ejercicio.servicio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.fasterxml.jackson.databind.ObjectMapper;

@ExtendWith(MockitoExtension.class)
public class ConvertidorServicioTest {

	@InjectMocks
	private ConvertidorServicioImpl servicio;

	public void servicioTestLogica() {
		String respuesta;

		// Creamos el mensaje
		HashMap<Integer, String> valores = new HashMap<Integer, String>();
		valores.put(2, "12346578901234567");
		valores.put(28, "20201005");

		respuesta = servicio.convertirMensaje(valores);

		assertEquals("4000001000000000171234657890123456720201005", respuesta);
	}

}
