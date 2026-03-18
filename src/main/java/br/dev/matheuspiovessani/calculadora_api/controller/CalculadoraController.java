package br.dev.matheuspiovessani.calculadora_api.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.matheuspiovessani.calculadora_api.dto.CalculadoraRequest;
import br.dev.matheuspiovessani.calculadora_api.dto.CalculadoraResponse;
import br.dev.matheuspiovessani.calculadora_api.service.CalculadoraService;

@RestController
@RequestMapping("/calculadora")

public class CalculadoraController {

    private final CalculadoraService service;

    public CalculadoraController(CalculadoraService service){
        this.service = service;
    }

    @PostMapping
    public CalculadoraResponse calcula(@Validated @RequestBody CalculadoraRequest request){
        return service.retornaResultado(request);
    }
}
