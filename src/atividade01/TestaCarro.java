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
        c1.ano = 2010;
        c1.marca = "Chevrolet";
        c1.valor = 25000;
        
        System.out.println(c1.valor);
        if(c1.serPopular() == true) {
            System.out.println("O carro é popular");
        }
        else {
            System.out.println("O carro não é popular");
        }
        System.out.println(c1.calcularDepreciacao(2020));
    }
}
