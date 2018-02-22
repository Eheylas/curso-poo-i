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
public class TestaFuncionario {
    
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(0003,"AAAAA",1,5040.20);
        
        System.out.println(f1.getMatricula());
        System.out.println(f1.getNome());
        System.out.println(f1.getSexo());
        System.out.println(f1.getSalario());
        
        System.out.println(f1);
    }
}
