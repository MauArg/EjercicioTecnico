package ar.com.churrasco.Ejercicio.controlador;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

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

@WebMvcTest(ControladorTest.class)
public class ControladorTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void controladorTestBasico() throws Exception {
		// Creamos el mensaje
		MensajeEntrante mensaje = new MensajeEntrante();
		mensaje.setCampos(
				Arrays.<Campo>asList(new Campo((byte) 2, "12346578901234567"), new Campo((byte) 28, "20201005")));

		// Configuramos el request POST
		RequestBuilder request = MockMvcRequestBuilders.post("/convertidor-mensajes").content(jsonToString(mensaje))
				.accept(MediaType.APPLICATION_JSON);

		// Obtenemos la respuesta y la verificamos
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
