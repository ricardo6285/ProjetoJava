
package com.mycompany.exerciciovetor;

import javax.swing.JOptionPane;

public class Exercicio9 {
     public void executar(){
         int valor [] = new int[5];
         String x;
       int soma = 0;
       
         // Entrada de dados
         for(int i = 0; i < valor.length;i++){
             x = JOptionPane.showInputDialog(null,"Digite um valor: ");
             valor[i] = Integer.parseInt(x);
             soma = soma + valor[i];
         }
         // Calcula a media com o valor que foi somado acima
         double media = (double)soma / valor.length;
         
         // Verifica maiores que a media
         String acima = "Valores acima da media:\n";
         
         for(int i = 0; i < valor.length;i++){
             if(valor[i] > media){
                 acima = acima + valor[i] + "\n";
             }
         }
         JOptionPane.showMessageDialog(null,"Media: "+ media + "\n\n" + acima);
         }
         
     }

