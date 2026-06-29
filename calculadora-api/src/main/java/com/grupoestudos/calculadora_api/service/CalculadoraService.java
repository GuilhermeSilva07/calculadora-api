package com.grupoestudos.calculadora_api.service;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.time.LocalDateTime;

@Service
public class CalculadoraService {

    public Double soma(Double a, Double b){
        return a + b;
    }

    public Double subtracao(Double a, Double b){
        return a - b;
    }

    public Double multiplicacao(Double a, Double b){
        return a * b;
    }

    public Double divisao (Double a, Double b){
        return a / b;
    }

    public Map<String, String> obterStatus() {
        return Map.of(
                "status", "online",
                "mensagem", "API da Calculadora está funcionando!",
                "horario", LocalDateTime.now().toString()
        );
    }
}
