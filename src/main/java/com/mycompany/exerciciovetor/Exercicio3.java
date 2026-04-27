
package com.mycompany.exerciciovetor;

import javax.swing.JOptionPane;


public class Exercicio3 {
    public void executar(){
       int [] valor = new int[5];
       String x;
       
       for(int i =0; i < valor.length;i++){
           x = JOptionPane.showInputDialog(null,"Digite um numero:");
           valor[i] = Integer.parseInt(x);
       }
       int maior = valor[0];
       
       for(int i = 1; i < valor.length;i++){
           if(valor[i] > maior){
               maior = valor[i];
           }
           JOptionPane.showMessageDialog(null,"Maior número:"+ maior);
       }
    }
            
            
            
            
            
            
            
            
            
}
