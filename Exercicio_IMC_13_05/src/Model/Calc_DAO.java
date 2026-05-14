/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static View.Inicio_GUI.*;

public class Calc_DAO {
    public static double peso = 0 ,altura = 0,resultado=0;
      public static String classificacao = ""; 
    public static void resultado() {
      altura = Double.parseDouble(ALTURA_TXT.getText());
      peso = Double.parseDouble(PESO_TXT.getText());
      resultado = peso /(altura*altura);
      if (resultado < 19 ) {
		classificacao = "Abaixo do peso!";
                CLASSIFICACAO_TXT.setText(classificacao);
	} else if(resultado < 25){
		classificacao = "Peso ideal";
                CLASSIFICACAO_TXT.setText(classificacao);
	}else if(resultado < 30){
		classificacao = "Sobrepeso";
                CLASSIFICACAO_TXT.setText(classificacao);
	}else if(resultado< 35){
		classificacao = "Obesidade grau 1";
                CLASSIFICACAO_TXT.setText(classificacao);
	}else if(resultado < 40){
		classificacao = "Obesidade grau 2";
                CLASSIFICACAO_TXT.setText(classificacao);
	}else{
		classificacao = "Obesidade grau 3";
                CLASSIFICACAO_TXT.setText(classificacao);
	};
      EXIBIR_TXT.setText("Seu IMC é: " + String.valueOf(resultado));
   
    }
    
    
    
     public static void sair(){
        System.exit(0);
    }
     
   
}
