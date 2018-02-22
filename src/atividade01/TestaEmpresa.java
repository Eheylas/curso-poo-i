/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

/**
 *
 * @author Felipe Yuri Inoue
 */
public class TestaEmpresa {
    public static void main(String[] args) {
        
        Empresa emp = new Empresa(10);
        
        Gerente g1 = new Gerente(9999,"AAAAA",1,15000.00,4000.00);
        emp.contratarFuncionario(g1);
        Gerente g2 = new Gerente(9994,"BBBB",2,19000.00,3000.00);
        emp.contratarFuncionario(g2);
        
        Funcionario f = null;
        
        for (int i = 0; i < 8; i++) {
            if(i%2 == 0) {
                f = new Funcionario(i,"FFFF",1,1000.00);
            }
            else{
                f = new Funcionario(i,"GGGG",2,1300.00);
            }
            emp.contratarFuncionario(f);
        }
        
        emp.exibirFolhaPagamento();
    }
}
