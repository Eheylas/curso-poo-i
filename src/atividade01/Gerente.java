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
public class Gerente extends Funcionario {
    double bonus;
    
    Gerente(int matricula, String nome, int sexo, double salario, double bonus) {
        super(matricula, nome, sexo, salario);
    }
    
    public double getSalario() {
        return (super.getSalario() + bonus);
    }
}
