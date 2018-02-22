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
public class Empresa {
    Funcionario[] funcionariosArray;
    int totalFuncionarios = 0;
    
    Empresa(int tamanho) {
        funcionariosArray = new Funcionario[tamanho];
    }
    
    public void contratarFuncionario(Funcionario func) {
        funcionariosArray[totalFuncionarios] = func;
        totalFuncionarios++;
    }
    
    public void exibirFolhaPagamento() {
        double totalFolha = 0;
        int count = 0;
        
        while(count < totalFuncionarios) {
            System.out.println(funcionariosArray[count]);
            totalFolha += funcionariosArray[count].getSalario();
            count++;
        }
        
        System.out.println(totalFolha);
    }
}
