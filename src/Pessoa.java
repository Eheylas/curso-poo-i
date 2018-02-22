/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yves Bodê
 */
public class Pessoa {
    public static final int SEXO_MASCULINO = 1, SEXO_FEMININO = 2;
    private String nome;
    private int sexo;

    public Pessoa(String nome, int sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getSexo() {
        return sexo;
    }
    
    
}
