/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yves Bodê
 */
public class Carro {
    private String marca;
    private int ano;
    private double valor;
    
    public boolean serPopular() {
        if (this.valor < 25_00) {
            return true;
        }
        return false;
    }
    
    public double calcularDepreciacao(int anoDeDepreciacao) {
        double valorDepreciado = (anoDeDepreciacao - this.ano) * 0.01 * this.valor; 
        return this.valor - valorDepreciado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
