
package com.mycompany.exerciciovetor;


import javax.swing.JOptionPane;


public class Exercicio2 {

    public void executar() {

        int[] valor = new int[5];
        String x;
        int soma = 0;

        for (int i = 0; i < valor.length; i++) {
            x = JOptionPane.showInputDialog("Digite um número:");
            valor[i] = Integer.parseInt(x);
            soma = soma + valor[i];
        }

        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
}

