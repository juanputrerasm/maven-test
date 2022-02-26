package cl.juanpablomezau.test;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

public class Main {

	public static void main(String[] args) {
		String request = "demo";
		
		String response = WebClient
				.create()
				.post()
				.uri("http://localhost:8080/triton/v1/checklogin")
				.body(BodyInserters.fromValue(request))
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(String.class)
				.block();

		System.out.println(response);
	}

}
