
package com.mycompany.exerciciovetor;

import javax.swing.JOptionPane;


public class Exercicio7 {
     public void executar(){
         int[] valor = new int[5];
         String x;
         int maior = 0 ;
         
// entrada de dados
         for(int i = 0; i < valor.length;i++){
             x = JOptionPane.showInputDialog(null,"Digite um valor:");
             valor[i] = Integer.parseInt(x);
         }
         
         // Inicializa com o primeiro valor ja preenchido
         maior = valor[0];
         
         // Verifica o maior
            for(int i = 0; i < valor.length;i++){
                if(valor[i] > maior){
                    maior = valor[i];
                }
            }
            JOptionPane.showMessageDialog(null,"Maior valor "+ maior);
     }
}
