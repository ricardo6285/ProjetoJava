
package Model;

import static View.Inicio_GUI.*;
import java.awt.Color;
import javax.swing.JOptionPane;


public class Funcoes_DAO {
    public static int val1 = 0, val2=0,res = 0;
    public static double va1 =0, va2 = 0,res1=0;
    public static void soma() {
         val1 = Integer.parseInt(VALOR1_TXT.getText());
         val2 = Integer.parseInt(VALOR2_TXT.getText());
         res = val1 + val2;
         
         //RESULTADO_TXT.setVisible(true);
         
         RESULTADO_TXT.setText(String.valueOf(res));
         RESULTADO_TXT.setBackground(Color.yellow);
        
          
        
    }
    public static void porcentagem(){
        va1 = Double.parseDouble(VALOR1_TXT.getText());
        va2 = Double.parseDouble(VALOR2_TXT.getText());
        res1 = va1 * (va2/100);
        RESULTADO_TXT.setText(String.valueOf(res1));
        RESULTADO_TXT.setBackground(Color.yellow);
                 //(porcentagem * valorTotal) / 100
    }
    
    public static void sub(){
         val1 = Integer.parseInt(VALOR1_TXT.getText());
         val2 = Integer.parseInt(VALOR2_TXT.getText());
                res = val1 - val2;
                 RESULTADO_TXT.setVisible(true);
         RESULTADO_TXT.setText(String.valueOf(res));
         RESULTADO_TXT.setBackground(Color.yellow);
    }
    
    public static void mult(){
         val1 = Integer.parseInt(VALOR1_TXT.getText());
         val2 = Integer.parseInt(VALOR2_TXT.getText());
                 res = val1 * val2;
                  RESULTADO_TXT.setVisible(true);
         RESULTADO_TXT.setText(String.valueOf(res));
         RESULTADO_TXT.setBackground(Color.yellow);
    }
    
    public static void div(){
         val1 = Integer.parseInt(VALOR1_TXT.getText());
         val2 = Integer.parseInt(VALOR2_TXT.getText());
                 res = val1 / val2;
                  RESULTADO_TXT.setVisible(true);
         RESULTADO_TXT.setText(String.valueOf(res));
         RESULTADO_TXT.setBackground(Color.yellow);
    }
    
    public static void limpar(){
        VALOR1_TXT.setText("");
        VALOR2_TXT.setText("");
       
        RESULTADO_TXT.setText("");
        RESULTADO_TXT.setBackground(Color.white);
    }
    
    
    
}
