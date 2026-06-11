
package Model;

import View.Inicio_GUI;
import static View.Inicio_GUI.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Funcoes_DAO {
public static int cod;
public static String nom;
public  static String end;
public static long tel;
       
   public static String url = "jdbc:mysql://localhost:3307/Exemplo"; // enderço do BD
   public static String username = "root";        //nome de um usuário de seu BD
   public static String password = "";  // senha do BD
   
   
   public static void salvar(){
       //--->inicio
      nom = nome_txt.getText(); // recebendo o nome
      end = end_txt.getText(); // recebendo o email
      tel = Long.valueOf(tel1_txt.getText());// recebendo o telefone
      
    

      Controller.ConectaDB_DB.carregaDriver();
       
      try { 
               
                   
               
            Connection con = null;
            
            
    try {
    con = (Connection) DriverManager.getConnection(url, username, password);
    } catch (SQLException ex) {

    Logger.getLogger(Inicio_GUI.class.getName()).log(Level.SEVERE, null, ex);

            
                   }

            // Recebendo os dados a serem inseridos na tabela
            String sql = "INSERT INTO cliente(cli_nome,cli_end,cli_tel) values('"+nom+"','"+end+"','"+tel+"')";
     
            try { // Tratamento de Erros para inserção

                // Criando varialvel que executara a inserção
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserção

  JOptionPane.showMessageDialog(null,"\nInserção realizada com sucesso!!!\n","",-1);
                nome_txt.setText("");
                end_txt.setText("");
                tel1_txt.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Tratamento de erro caso o usuario não digite o telefone corretamente
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente","ERRO",0);
            tel1_txt.setText("");
        }

       
              }
       
       
       //----> fim
   
   public static void consultar(){
       //-----> inicio
       try{     //Iniciando o possivel tratamento de erros 

            //Declarando a variavel código 

            int codigo = Integer.valueOf(cod1_txt.getText()); 

            Controller.ConectaDB_DB.carregaDriver(); // Carregando o driver 

            try {// Tratamento de erro para a conexao 

                // Declarando  a variavel de conexão con 

                // e estabelendo a conexão 

                Connection con = null; 

 

                try { 

                    con = (Connection) DriverManager.getConnection(url, username, password); 

                } catch (SQLException ex) { 

                    Logger.getLogger(Inicio_GUI.class.getName()).log(Level.SEVERE, null, ex); 

                } 

 

                // Declarando uma string com o comando mySQL para consulta 

                String sql = "SELECT cli_nome,cli_end, cli_tel FROM cliente where cli_cod = "+codigo; 

                // Criando variavel que executara o comando da string sql 

                Statement stm = (Statement) con.createStatement(); 

                try//Tratamento de erro da consulta 

                { //Criando variavel que exibira os resultados 

                    //Executando o comando da string sql na variavel rs 

                    ResultSet rs = stm.executeQuery(sql); 

 

                    int i=0; // Variavel utilizada para saber se ha dados cadastrados 

 

                    while (rs.next()) {  // Criando variaveis que receberão os valores do banco de dados 

                         nom = rs.getString("cli_nome"); 

                         end = rs.getString("cli_end"); 

                        String tel = rs.getString("cli_tel"); 

 

                        i++; 

 

                        //JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nEmail: " +telefone + "\nTelefone: " +telefone, "Resultado",-1); 

                        nome1_txt.setText(String.valueOf(nom)); 

                        end1_txt.setText(String.valueOf(end)); 

                        tel2_txt.setText(String.valueOf(tel)); 

 

                    } 

 

                    if(i==0){ // Verificando se ha dados cadastrados atraves da variavel i 

 

                        JOptionPane.showMessageDialog(null,"Dado não cadastrado","Resultado",-1); 

 

                    } 

 

                } catch (Exception ex) { // Consulta mal sucedida 

                    JOptionPane.showMessageDialog(null,"\nErro ao consultar!","ERRO",0); 

                } 

 

            } catch (SQLException ex) { 

                // Conexão com servidor mal sucedida 

                JOptionPane.showMessageDialog(null,"Erro ao conectar com o servidor","ERRO!",0); 

            } 

 

        }catch(NumberFormatException erro){ 

            // Código fora do formato 

            JOptionPane.showMessageDialog(null,"Digite o código corretamante","ERRO",0); 

            cod1_txt.setText(""); 

        } 
       
       
       //-----> fim
   }
   } 

