package br.dev.matheuspiovessani.calculadora_api.service;

import org.springframework.stereotype.Service;

import br.dev.matheuspiovessani.calculadora_api.dto.CalculadoraRequest;
import br.dev.matheuspiovessani.calculadora_api.dto.CalculadoraResponse;

@Service //Util para o Spring saber que essa classe é um componente gerenciado por ele
public class CalculadoraService {
    public CalculadoraResponse retornaResultado(CalculadoraRequest valores){
        if("/".equals(valores.getOperacao()) && valores.getValor2() == 0.0){
            throw new ArithmeticException("Divisao invalida");
        }
        double resultado = switch (valores.getOperacao()) {
            case "+" -> valores.getValor1() + valores.getValor2();
            case "-" -> valores.getValor1() - valores.getValor2();
            case "*" -> valores.getValor1() * valores.getValor2();
            case "/" -> valores.getValor1() / valores.getValor2();
            default -> throw new IllegalArgumentException("Operação inválida");
        };
        CalculadoraResponse response = new CalculadoraResponse();
        response.setResultado(resultado);
        return response;
    }
}
