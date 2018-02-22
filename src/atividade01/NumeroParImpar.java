
package atividade01;
 class NumeroParImpar {
     public static void main(String[] args) {
         int numero = 5;
         int resto = 2;
         int calculo = numero % resto;
         
         if(calculo == 0){
            System.out.println("Esse número é par!!");
        }
         else{
             System.out.println("Esse número é ímpar!!");
         }
     }
}
