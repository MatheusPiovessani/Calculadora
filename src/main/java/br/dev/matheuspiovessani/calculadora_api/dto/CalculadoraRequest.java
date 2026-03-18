package br.dev.matheuspiovessani.calculadora_api.dto;

public class CalculadoraRequest {

private Double valor1;
private Double valor2;
private String operacao;
    
    public double getValor1() {
        return valor1;
    }
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
    public double getValor2() {
        return valor2;
    }
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    public String getOperacao() {
        return operacao;
    }
    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
}
