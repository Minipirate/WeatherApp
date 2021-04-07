/**
 * 
 */
package fr.diginamic.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.diginamic.model.weather.WeatherData;

/**
 * @author Ness'ti
 *
 */
@Service

public class ApiWeatherCall {

	@Scheduled(fixedRate = 5000) 
	public static void declencherAppels() throws URISyntaxException, JsonMappingException, JsonProcessingException {

		RestTemplate restTemplate = new RestTemplate();

		String baseUrl = "http://api.openweathermap.org/data/2.5/weather?q=Amiens&units=metric&lang=fr&appid=2478676a8ddaf82dfa90dd30e62745a5";
		URI uri = new URI(baseUrl);

		ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
		String jsonString = response.getBody();
		System.out.println(jsonString);

		/* Utilisation de Jackson pour transformer une String en objet */
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		WeatherData bean = mapper.readValue(jsonString, WeatherData.class);

		System.out.println(bean.getCoord());

	}
}
