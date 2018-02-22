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
public class Funcionario extends Pessoa{
    public final static int SEXO_MASCULINO = 1;
    public final static int SEXO_FEMININO = 2;
    int matricula;
    double salario;

    public Funcionario(int matricula, String nome, int sexo, double salario) {
        super(nome, sexo);
        this.matricula = matricula;
        this.salario = salario;
    }
    
    public String toString() {
        return ("Funcionario { matrícula = " + matricula +
                ", nome = " + getNome() +
                ", sexo = " + getSexo() +
                ", salário = " + getSalario() +
                " }");
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

}
