package ar.com.churrasco.Ejercicio.controlador;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.churrasco.Ejercicio.entidad.Campo;
import ar.com.churrasco.Ejercicio.entidad.MensajeEntrante;

@WebMvcTest(ConvertidorControlador.class)
public class ConvertidorControladorTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void controladorTestBasico() throws Exception {
		// Creamos el mensaje
		HashMap<Integer, String> valores = new HashMap<Integer, String>();
		valores.put(2, "12346578901234567");
		valores.put(28, "20201005");

//		// Configuramos el request POST
		RequestBuilder request = MockMvcRequestBuilders.post("/convertidor-mensajes").content(jsonToString(valores))
				.accept(MediaType.APPLICATION_JSON);
//
//		// Obtenemos la respuesta y la verificamos
		MvcResult result = mockMvc.perform(request).andExpect(status().isOk())
				.andExpect(content().string("4000001000000000171234657890123456720201005")).andReturn();

	}

	private String jsonToString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			final String jsonContent = mapper.writeValueAsString(obj);
			return jsonContent;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
