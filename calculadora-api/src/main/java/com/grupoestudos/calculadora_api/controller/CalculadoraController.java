// 1. Diz em qual pacote essa classe está
package com.grupoestudos.calculadora_api.controller;

// 2. Importa as ferramentas que vamos usar do Spring
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 3. Importa o Map do Java
import java.util.Map;

// 4. Diz pro Spring que essa classe recebe requisições HTTP
@RestController

// 5. Define que todos os endpoints dessa classe começam com /calcular
@RequestMapping("/calcular")
public class CalculadoraController {

    @GetMapping("/soma")
    public Map<String, Double> soma(@RequestParam Double a,
                                    @RequestParam Double b){
        Double resultado = a + b;
        return Map.of("Resultado", resultado);
    }

    @GetMapping("/subtracao")
    public Map<String, Double> subtracao(@RequestParam Double a,
                                         @RequestParam Double b){
        Double resultado = a - b;
        System.out.println(resultado);
        return Map.of("Resultado:", resultado);
    }

    // 6. Implementando endpoint de Divisão
    @GetMapping("/divisao")
    public ResponseEntity<Map<String, Object>> divisao(@RequestParam Double a, @RequestParam Double b) {
        // Trata o desafio extra: divisão por zero
        if (b == 0) {
            // Retorna o erro com Status HTTP 400 (Bad Request)
            return ResponseEntity.badRequest().body(Map.of("erro", "Não é possível dividir por zero"));
        }
        // Se passar pelo if, faz a divisão normalmente
        Double resultado = a / b;
        // Retorna o sucesso com Status HTTP 200 (OK)
        return ResponseEntity.ok(Map.of("resultado", resultado));
    }

}