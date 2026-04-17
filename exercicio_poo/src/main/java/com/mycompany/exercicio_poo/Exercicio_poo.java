/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_poo;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Exercicio_poo {

     // 3. Imprima todos os múltiplos de 3, entre 1 e 100;
 
    public static void exercicio3() {
        String mostra = "";
        for (int c = 1; c <= 100; c++) {
            if (c % 3 == 0) {
                mostra = mostra + c + "\n";
            }
 
        }
        JOptionPane.showMessageDialog(null, mostra);
 
    }
}
