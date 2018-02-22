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
public class TestaCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setAno(2010);
        c1.setMarca("Chevrolet");
        c1.setValor(25000.00);
        
        System.out.println(c1.getValor());
        if(c1.serPopular() == true) {
            System.out.println("O carro é popular");
        }
        else {
            System.out.println("O carro não é popular");
        }
        System.out.println(c1.calcularDepreciacao(2020));
    }
}
