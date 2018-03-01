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
public class TestaGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente(0020,"GGGG",2,15200.30,5000.00);
        
        System.out.println(g1);
        
        Funcionario f2 = new Funcionario(0203,"HHHH",1,1203.99);
        
        System.out.println(f2);
    }
}
