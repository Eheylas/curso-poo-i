
package atividade01;

public class Carro {
    public String marca;
    public int ano;
    public double valor;
    
    public boolean serPopular(){
        return valor < 25.000;      
    }
    public double calcularDepreciacao(int ano){
        
        double valorDepreciado = ano - this.ano * 0.01 * this.valor;
        return valor - valorDepreciado;
        
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
