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
public class Gerente extends Funcionario{
    
    public Gerente(String nome, int sexo, int matricula, double salario, double bonus) {
        super(nome, sexo, matricula, salario);
        this.bonus = bonus;
    }
    
    private double bonus;
    
    public double getSalario() {
        return this.salario + this.bonus;
    }

}
