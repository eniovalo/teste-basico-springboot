package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	HelloService helloService;

	@GetMapping("/")
	public String index() {
		final LocalDate data = helloService.getData("23/07/2023");
        final int resultadoSomatoria = helloService.somar(1, 3);
        final double resultaMultiplicacao = helloService.multiplicar(2, 3);
        final String texto = String.format("Olá Spring Boot %s , soma: %d , multiplicação: %f", 
            data, 
            resultadoSomatoria, 
            resultaMultiplicacao);

        return texto;
	}

}