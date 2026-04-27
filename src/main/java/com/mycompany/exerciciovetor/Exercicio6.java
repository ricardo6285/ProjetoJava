
package com.mycompany.exerciciovetor;

import javax.swing.JOptionPane;


public class Exercicio6 {
    public void executar() {
        int[] valor = new int[5];
        String x;
        String mostra = "";
        
        // Entrada de dados
        for(int i = 0;i < valor.length;i++){
            x = JOptionPane.showInputDialog(null,"Digite um numero:");
            valor[i] = Integer.parseInt(x);
        }
       for(int i = valor.length - 1; i >=0; i--){
           mostra = mostra + valor[i] + " ";
       }
    JOptionPane.showMessageDialog(null,mostra);
    }
}
