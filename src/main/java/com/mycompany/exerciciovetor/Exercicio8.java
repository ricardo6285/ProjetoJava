
package com.mycompany.exerciciovetor;

import javax.swing.JOptionPane;


public class Exercicio8 {
     public void executar(){
         int valor[] = new int[6];
         String x;
         int soma=0;
         
         
         // Entrada de dados
         for(int i = 0 ; i < valor.length;i++){
             x = JOptionPane.showInputDialog(null,"Digite um valor: ");
             valor[i] = Integer.parseInt(x);
              //Soma
             soma = soma + valor[i];
         }
        // Saida
         JOptionPane.showMessageDialog(null,"Soma total: "+soma);
         
             
         
         
     }
}
