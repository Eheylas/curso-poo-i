
package atividade01;

public class Carro {
    private String marca;
    private int ano;
    private double valor;
    
    public boolean serPopular(){
        return this.getValor() < 25.000;      
    }
    public double calcularDepreciacao(int ano){
        
        double valorDepreciado = ano - this.getAno() * 0.01 * this.getValor();
        return this.getValor() - valorDepreciado;
        
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
