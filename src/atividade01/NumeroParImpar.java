
package atividade01;
 class NumeroParImpar {
     public static void main(String[] args) {
         int numero = 76;
         int resto = 2;
         
         resto = numero % resto;
         
         if(resto == 0){
            System.out.println("Esse número é par!!");
        }
         else{
             System.out.println("Esse número é ímpar!!");
         }
     }
}
