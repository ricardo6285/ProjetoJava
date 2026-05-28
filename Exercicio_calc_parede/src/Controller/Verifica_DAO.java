/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;
import static View.Login_GUI.cont;
import static View.Login_GUI.login_txt;
import static View.Login_GUI.senha_txt;
import View.Menu_GUI;


/**
 *
 * @author USER
 */
public class Verifica_DAO {
       public static void verifica(){
                  String login = login_txt.getText();
        String senha = senha_txt.getText();
      
        
        if(cont == 3){
        JOptionPane.showMessageDialog(null,"Numero de tentativas excedido!!");
        System.exit(0);
        }else{
            if(login.equals("ETEC")&& senha.equals("a123")){
            JOptionPane.showMessageDialog(null,"Seja bem-vindo ao Sistema!!");
             new Menu_GUI().setVisible(true);
             
            }else{
                JOptionPane.showMessageDialog(null,"Login ou senha errada Tente novamente!!");
                login_txt.setText("");
                senha_txt.setText("");
                cont++;
            }
        }
        
        
    }   
}
