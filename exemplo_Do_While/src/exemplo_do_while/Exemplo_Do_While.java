/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_do_while;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Exemplo_Do_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int op = 0,op2 =0;
        long rg=0,cpf=0;
        
        do{
            System.out.println("***********CADASTRO DE CLIENTES**************");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Excluir");
            op = grava.nextInt();
            switch(op){
                case 1:
                    System.out.println("Digite seu RG:");
                    rg=grava.nextInt();
                    System.out.println("Digite seu CPF:");
                    cpf=grava.nextInt();
                    break;
                 
                case 2:
                    System.out.println("RG:"+rg);
                    System.out.println("CPF:"+cpf);
                    break;
                    
                case 3:
                    System.out.println("Digite o seu RG:");
                    rg=grava.nextInt();
                    System.out.println("Digite seu CPF:");
                    cpf=grava.nextInt();
                    break;
                    
                case 4:
                    rg=0;
                    cpf=0;
                    break;
                    
                    
            }
        System.out.println("Digite 1-Continuar ou 2-para Sair");
        op2=grava.nextInt();
    }while(op2!=2);
    
}
}
