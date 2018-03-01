package atividade01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yves Bodê
 */
public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alex", Pessoa.SEXO_FEMININO, 131313, 23_000, 2_000);
        System.out.println(gerente);
        
        Funcionario funcionario = gerente;
        
        System.out.println(funcionario);
    }
}
