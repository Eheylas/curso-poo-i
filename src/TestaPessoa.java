/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1714290010
 */
public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Marcus", "Masculino");
        System.out.println("Nome da pessoa: " + pessoa.getNome());
        System.out.println("Sexo da pessoa: " + pessoa.getSexo());
    }
}
