
package com.mycompany.exerciciovetor;

import javax.swing.JOptionPane;

public class Exercicio4 {
    public  void executar() {
        int [] valor = new int [10];
        String x;
        int contador = 0;
        
        //entrada de dados
        for(int i =0; i < valor.length;i++){
            x = JOptionPane.showInputDialog(null,"Digite um número:");
            valor[i] = Integer.parseInt(x);
            
        }//contar pares
        for(int i = 0; i < valor.length;i++){
            if(valor[i] % 2 == 0){
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null,"Quantidade de números pares: "+contador);
    }
}
