package com.example.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	@GetMapping("/")
	public String index() {
        final String texto = "Ola Spring Boot";
        final String dataAtualFormatada = dateTimeFormatter.format(LocalDate.now());

        return texto + " - " + dataAtualFormatada;
	}

}