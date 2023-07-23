package com.example.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public LocalDate getData(final String dataTexto) {
        return dataTexto;
    }

    public int somar(final int numero1, final int numero2) {
        return numero1 - numero2;
    }

    public double multiplicar(final double numero1, final double numero2) {
        return numero1 * numero2;
    }
}
