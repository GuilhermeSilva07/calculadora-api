package com.grupoestudos.calculadora_api.controller;

import com.grupoestudos.calculadora_api.service.CalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;


@RestController
@RequestMapping("/calcular")
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @GetMapping("/soma")
    public Map<String, Double> soma(@RequestParam Double a,
                                    @RequestParam Double b){
        Double resultado = calculadoraService.soma(a, b);
        return Map.of("Resultado", resultado);
    }

    @GetMapping("/subtracao")
    public Map<String, Double> subtracao(@RequestParam Double a,
                                         @RequestParam Double b){
        Double resultado = calculadoraService.subtracao(a,b);
        return Map.of("Resultado:", resultado);
    }

    @GetMapping("/divisao")
    public ResponseEntity<Map<String, Object>> divisao(@RequestParam Double a, @RequestParam Double b) {
        if (b == 0) {
            return ResponseEntity.badRequest().body(Map.of("erro", "Não é possível dividir por zero"));
        }
        Double resultado = calculadoraService.divisao(a, b);
        return ResponseEntity.ok(Map.of("resultado", resultado));
    }

    @GetMapping("/multiplicacao")
    public ResponseEntity<Map<String, Object>> multiplicacao(@RequestParam Double a, @RequestParam Double b) {
        Double resultado = calculadoraService.multiplicacao(a,b);
        return ResponseEntity.ok(Map.of("resultado", resultado));
    }

    @GetMapping("/potencia")
    public ResponseEntity<Map<String, Object>> potencia(@RequestParam Double a, @RequestParam Double b){
        Double resultado = calculadoraService.potencia(a, b);
        return  ResponseEntity.ok(Map.of("resultado", resultado));
    }
}