package com.grupoestudos.calculadora_api.service;

import org.springframework.stereotype.Service;

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
        if (b == 0 || a == 0) {
           throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        return a / b;
    }

    public Double potencia (Double a, Double b) { return Math.pow(a, b); }
}
