/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1714290010
 */
public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Alberto", Pessoa.SEXO_MASCULINO, 121212, 5_000.00);
        System.out.println("FICHA DO FUNCIONARIO \nNome: "      + funcionario.getNome()
                                                 + "\nMatricula: " + funcionario.getMatricula()
                                                 + "\nSexo: "      + funcionario.getSexo()
                                                 + "\nSalario: "   + funcionario.getSalario());
        
        System.out.println(funcionario);
    }
}
