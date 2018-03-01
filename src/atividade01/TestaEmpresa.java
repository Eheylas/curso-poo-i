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
public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa padaria = new Empresa(10);
        Funcionario f1920 = new Funcionario("Jair", Pessoa.SEXO_MASCULINO, 1920, 1_200.00);
        Funcionario f1922 = new Funcionario("Paula", Pessoa.SEXO_FEMININO, 1922, 1_200.00);
        Funcionario f1923 = new Funcionario("Marco", Pessoa.SEXO_MASCULINO, 1923, 1_200.00);
        Gerente g2012 = new Gerente("Marcia", Pessoa.SEXO_FEMININO, 2012, 3_000.00, 1_200.00);
        Gerente g2013 = new Gerente("Roberto", Pessoa.SEXO_MASCULINO, 2013, 4_000.00, 2_000.00);
        
        padaria.contratarFuncionario(f1920);
        padaria.contratarFuncionario(f1922);
        padaria.contratarFuncionario(f1923);
        padaria.contratarFuncionario(g2012);
        padaria.contratarFuncionario(g2013);
        
        padaria.exibirFolhaPagamento();
    }
}
