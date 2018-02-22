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
public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Felipe",Pessoa.SEXO_MASCULINO);
        
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Sexo: "+p1.getSexo());
    }
}
