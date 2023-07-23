package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloServiceTest {
	@Autowired
	HelloService helloService;

	@Test
    public void getDataTest() {
        var df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        final var dataEsperada = LocalDate.parse("23/07/2023", df);

        final var dataResultado = helloService.getData("23/07/2023");
        Assertions.assertEquals(dataEsperada, dataResultado);
    }

    @Test
    public void somarTest() {
        final var somatoria = helloService.somar(2, 5);
        Assertions.assertEquals(7, somatoria);
    }

    @Test
    public void multiplicarTest() {
        final var multiplicacao = helloService.multiplicar(2, 5);
        Assertions.assertEquals(10, multiplicacao);
    }
}