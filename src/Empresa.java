/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yves Bodê
 */
public class Empresa {
    Funcionario[] funcionariosArray;
    private int totalFuncionarios = 0;

    public Empresa(int tamanho) {
        this.funcionariosArray = new Funcionario[tamanho];
    }
    
    public void contratarFuncionario(Funcionario funcionario) {
        this.funcionariosArray[totalFuncionarios] = funcionario;
        this.totalFuncionarios++;
    }
    
    public void exibirFolhaPagamento() {
        int totalFolha = 0;
        for(int i = 0; i < this.totalFuncionarios; i++) {
            System.out.println(funcionariosArray[i]);
            totalFolha += funcionariosArray[i].getSalario();
        }
        System.out.println("Total da folha de pagamento: " + totalFolha);
    }
    
    
}
