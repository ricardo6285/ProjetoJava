package aula25_03_while;

import java.util.Scanner;


public class Aula25_03_while {

 
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        
        
//        int tab;
//        int c = 1;
//        System.out.print("Escolha uma tabuada do 1 ao 9: ");
//        tab =grava.nextInt();
//        
//        while(c<=10){
//        System.out.println(tab + " x " + c + " = " + (tab * c));
//        c++;
//        }
     //IF(C % 2 !=0) IMPAR IGUAL PAR   
    //==========================================================================
    //============ Exercicio 01 ================================================
//     int numeros = 150;
//      System.out.println("Digite um numero acima de 150");
//      numeros = grava.nextInt();
//      
//      while(numeros <=300){
//          System.out.println(numeros );
//          numeros++;
//      }
////==============================================================================
//    //============ Exercicio 02 ================================================ 
//     int numero=100;
//     
//     System.out.println("Digite um numero: ");
//     numero = grava.nextInt();
//     
//     while(numero <=200){
//         if(numero % 2 == 0){
//               System.out.println(numero+" par");
//             numero++;
//           
//         }
//         else if(numero % 2 != 0){
//             System.out.println(numero+" impar");
//             numero++;
//         }
//     }
  ////==============================================================================
//    //============ Exercicio 03 ================================================     
//     int numero =100;
//     while(numero >=0){
//         System.out.println(numero);
//         numero--;
//     }
  ////==============================================================================
//    //============ Exercicio 04 ================================================ 
//int numero = 1, fib = 0;
//while(numero <=1000){
//    fib = fib + numero;
//    numero++;
//}
//System.out.println("A soma dos numeros 1 até 1000 é:"+fib);
  ////==============================================================================
//    //============ Exercicio 04 ================================================ 
//        int a = 1, b = 1;
//        int soma = 0;
//
//        while (a <= 1000) {
//            soma += a;
//            System.out.println("Fibonacci: " + a + " | Soma atual: " + soma);
//
//            int temp = a + b;
//            a = b;
//            b = temp;
//        }
//
//        System.out.println("Resultado final: " + soma);

/// exemplo ===================================================================
//============================= EXEMPLO =======================================



//          int op=0 , op2=0;
//          long rg=0, cpf=0;
//          
//          do{
//          System.out.println("** CADASTRO DE CLIENTES **");
//          System.out.println("1 - Cadastrar");
//          System.out.println("2 - Consultar");
//          System.out.println("3 - Alterar");
//          System.out.println("4 - Excluir");
//          op = grava.nextInt();
//          switch(op){
//              
//              case 1 :
//                  System.out.println("Digite o seu RG");
//                  rg = grava.nextInt();
//                  System.out.println("Digite o seu CPF");
//                  cpf = grava.nextInt();
//                  break;
//              
//              case 2 :
//                  System.out.println("RG : " + rg);
//                  System.out.println("CPF : " + cpf);
//                  break;
//              case 3 :
//                  System.out.println("Digite o seu RG");
//                  rg = grava.nextInt();
//                  System.out.println("Digite o seu CPF");
//                  cpf = grava.nextInt();
//                  break;
//                  
//              case 4 :
//                  rg = 0;
//                  cpf =0;
//                  break;
//              
//          }
//          
//          
//          
//          System.out.println("Digite 1- Continuar ou 2 para sair");
//          op2 = grava.nextInt();
//          }while(op2 != 2);

//=============================================================================
//=============================================================================
//================ Desafio ====================================================
 int temperatura;
 int umidade;
 int chuva;
 
 System.out.println("Qual é a temperatura:");
 temperatura = grava.nextInt();
 
  System.out.println("Qual é a umidade:");
 umidade = grava.nextInt();
 
  System.out.println("Esta chovendo:\n1-Sim\n2-Não");
chuva = grava.nextInt();

if(temperatura < 30 && umidade > 50 && chuva == 2){
    System.out.println("Risco baixo");
}
        
else if(temperatura >= 30 && temperatura <= 35 && umidade >= 30 && umidade <= 50 && chuva == 2){
    System.out.println("Risco medio");
}
else if(temperatura > 35 && umidade < 30 && chuva == 2){
    System.out.println("Risco Alto de Queimadas");
}
else if(temperatura > 35 && umidade < 30 && chuva == 1){
    System.out.println("Risco Alto de Queimadas"); 



    }
}