
package aula18_03;

import java.util.Scanner;


public class Aula18_03 {

   
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        //// EXERCICIOS 06 ////////////////////////
//        float nota1,nota2,nota3,media;
//        int faltas;
//        int presenca=100;
//        int frequencia;
//        
//        System.out.print("Digite a nota 1 :");
//        nota1 = grava.nextFloat();
//        
//        System.out.print("Digite a nota 2 :");
//        nota2 = grava.nextFloat();
//        
//        System.out.print("Digite a nota 3 :");
//        nota3 = grava.nextFloat();
//        
//         media = (nota1 + nota2 + nota3)/3;
//        System.out.println("Sua media foi de: "+media);
//        
//        System.out.print("Digite o numero de faltas:");
//        faltas = grava.nextInt();
//        
//       
//        
//        frequencia = presenca -(presenca * faltas/100);
//        
//        if(media >= 7 && media < 10 && frequencia >= 75){
//            System.out.println("Aprovado");
//        }
//        else if(media >=5 && media <=6.9 && frequencia >= 75){
//            System.out.println("Recuperacao");
//        }
//        else if(media < 5 || frequencia < 75){
//            System.out.println("Reprovado");
//        }
//        else if(media == 10 && frequencia == 100){
//            System.out.println("Aprovado com Destinção");
//        }
        
 //=============================================================================
     ///////// EXERCICO 07 ////////////////////////////
//     double valorCompra;
//     int clienteVip;
//     int formaPagamento;
//     double valorFinal=0;
//     
//     
//     System.out.print("Digite o valor da compra: ");
//     valorCompra = grava.nextDouble();
//     
//     System.out.print("Cliente Vip 1-sim 2-não\n");
//     clienteVip = grava.nextInt();
//     
//     System.out.print("Qual vai ser a forma de pagamento:1-avista 2-parcelado\n");
//     formaPagamento = grava.nextInt();
//     
//     if(clienteVip == 1 && formaPagamento == 1 ){
//         valorFinal = valorCompra - (valorCompra * 20 / 100);
//         System.out.print(valorFinal);
//     }
//     else if(clienteVip == 1 && formaPagamento == 2){
//         valorFinal = valorCompra - (valorCompra * 10 / 100);
//     }   
//     else if(clienteVip == 2 && formaPagamento == 1 && valorCompra >= 500){
//         valorFinal = valorCompra - (valorCompra * 15 / 100);
//     }
//     else if(clienteVip == 2 && formaPagamento == 2 && valorCompra > 500){
//         valorFinal = valorCompra - (valorCompra * 5 / 100);
//     }
//     else{
//    System.out.print("Sem Desconto");
//     }
// System.out.print(valorFinal);
 
 //=============================================================================
 ////// EXERCICIO 08 ///////////////////////////////////////////////////////
// 
// int cargo,horarioEntrada,diaSemana;
// 
// System.out.print("Qual seu cargo 1-Gerente 2-Supervisor 3-Funcionario");
// cargo = grava.nextInt();
// 
// System.out.print("Qual seu horario de entrada:");
// horarioEntrada = grava.nextInt();
// 
// System.out.print("Quais os dias da semana que voce acessa: 1-Dias uteis 2-Final de semana");
// diaSemana = grava.nextInt();
// 
// if(cargo == 1){
//     System.out.print("Acesso Total");
// }
// else if(cargo == 2 && horarioEntrada >= 6 && horarioEntrada <=22){
//     System.out.print("Acesso das 6h as 22h");
// }
// else if(cargo == 3 && horarioEntrada >=8 && horarioEntrada <=18 && diaSemana == 1){
//     System.out.print("Acesso das 8h as 18h em dias uteis");
// }
// else{
//     System.out.print("Acesso Negado");
// }
 
  //=============================================================================
 ////// EXERCICIO 09 ///////////////////////////////////////////////////////
 
// 9 - Leia:
// 
//Temperatura
//Tosse (S/N)
//Falta de ar (S/N)
//Saturação de oxigênio
// 
//Regras:
// 
//Temp = 39 e falta de ar = S e saturação < 92 ? Emergência
//Temp = 38 e tosse = S ? Suspeita infecciosa
//Temp < 37.5 ? Normal
//Caso contrário ? Monitoramento
// 
//Exibir classificação clínica. 

int tosse,faltaDeAr,saturacao;
double temperatura;
System.out.print("Qual a temperatura: ");
temperatura = grava.nextDouble();

System.out.print("Esta tossindo:\n 1-Sim\n 2-Não ");
tosse = grava.nextInt();

System.out.print("tem falta de ar:\n 1-Sim\n 2-Não ");
faltaDeAr = grava.nextInt();

System.out.print("Qual é a Saturação: ");
saturacao = grava.nextInt();

if(temperatura >= 39 && faltaDeAr == 1 && saturacao < 92 ){
    System.out.print("Emergencia");
}
else if(temperatura >= 38 && tosse == 1){
    System.out.print("Suspeita infecciosa");
}
else if(temperatura < 37.5){
    System.out.print("Voce Normal!!");
}
else{
    System.out.print("Fica em Monitoramento!!");
}




   //=============================================================================
 ////// EXERCICIO 10 ///////////////////////////////////////////////////////////
// 10 - CRIE UMA CLASSE QUE SIMULE O FUNCIONAMENTO DE UM CADASTRO 
//DE CLIENTE 
//MENU
//1 - inclusao
//2 - alteracao
//3 - exclusao
//4 - sair 
//Dados a serem cadastrados  somente na opção cadastrar
//numero do cpf 
//numero do rg
//codigo
}
}
    

