
package exerciciosjava;

import java.util.Scanner;
public class ExerciciosJava {

   
    public static void main(String[] args) {
         Scanner grava = new Scanner(System.in);
         
         int numero;
         
         System.out.print("Digite seu numero: ");
         numero = grava.nextInt();
         
         
         if(numero % 2 == 0){
             System.out.print("Par");
         }
         else{
             System.out.print("Impar");
         }
    }
    
}
