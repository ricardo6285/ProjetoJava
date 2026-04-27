
package com.mycompany.exerciciovetor;

import javax.swing.JOptionPane;

 class Exercicio5 {
    public void executar(){
        int [] valor = new int[5];
        String x;
        int soma = 0;
        double media = 0;
        
        // entrada de dados
        for(int i = 0; i < valor.length;i++){
            x = JOptionPane.showInputDialog(null,"Digite um numero:");
            valor[i] = Integer.parseInt(x);
        }
        
        //soma dos dados
        for(int i = 0; i < valor.length;i++){
            soma = soma + valor[i];
        }
         media = soma / valor.length;
         
        JOptionPane.showMessageDialog(null,"A soma das 5 notas: "+ soma + "\nMédia: "+media);
        
        // mostrar acima da media
        String acima = "Números acima da média:\n";
        for(int i = 0; i < valor.length;i++){
            if(valor[i] > media){
                acima = acima + valor[i]+"\n";
            }
        }
        
        JOptionPane.showMessageDialog(null,"Média: "+ media + "\n\n"+acima);
    }
}
