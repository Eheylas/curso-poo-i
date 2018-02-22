/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

/**
 *
 * @author 1714290026
 */
public class Carro {
    private String marca;
    private int ano;
    private double valor;
    
    boolean serPopular() {
        if(valor < 25000) {
            return true;
        }
        else {
            return false;
        }
    }
    
    double calcularDepreciacao(int ano) {
        double valorDepreciado = (ano - this.ano) * 0.01 * valor;
        return (valor - valorDepreciado);
    }
    
    String getMarca() {
        return marca;
    }
    
    void setMarca(String marca) {
        this.marca = marca;
    }
    
    int getAno() {
        return ano;
    }
    
    void setAno(int ano) {
        this.ano = ano;
    }
    
    double getValor() {
        return valor;
    }
    
    void setValor(double valor) {
        this.valor = valor;
    }
}
