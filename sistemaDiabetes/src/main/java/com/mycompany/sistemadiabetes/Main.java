
package com.mycompany.sistemadiabetes;
import java.util.Scanner;


public class Main {
     public static void main(String[] args) {
//        Conexao.conectar();
//        Scanner sc = new Scanner(System.in);
//        SistemaDiabetes sistema = new SistemaDiabetes();
//
//        int op;
//
//        do {
//            System.out.println("\n--- MENU ---");
//            System.out.println("1 - Adicionar medição");
//            System.out.println("2 - Listar medições");
//            System.out.println("3 - Média");
//            System.out.println("4 - Deletar medição");
//            System.out.println("5 - Atualizar medição");
//            System.out.println("0 - Sair");
//
//            op = sc.nextInt();
//            sc.nextLine();
//
//            if (op == 1) {
//                System.out.print("Data: ");
//                String data = sc.nextLine();
//
//                System.out.print("Glicose: ");
//                double glicose = sc.nextDouble();
//                sc.nextLine();
//
//                System.out.print("Tipo: ");
//                String tipo = sc.nextLine();
//
//                System.out.print("Observação: ");
//                String obs = sc.nextLine();
//
//                Medicao m = new Medicao(data, glicose, tipo, obs);
//                sistema.adicionar(m);
//                sistema.salvarBanco(m);
//            }
//
//            if (op == 2) {
//                sistema.listarBanco();
//            }
//
//            if (op == 3) {
//                sistema.media();
//            }
//            if (op == 4) {
//    System.out.print("Digite o ID para deletar: ");
//    int id = sc.nextInt();
//
//    sistema.deletar(id);
//}
//            if (op == 5) {
//
//    System.out.print("Digite o ID para atualizar: ");
//    int id = sc.nextInt();
//    sc.nextLine();
//
//    System.out.print("Nova Data: ");
//    String data = sc.nextLine();
//
//    System.out.print("Nova Glicose: ");
//    double glicose = sc.nextDouble();
//    sc.nextLine();
//
//    System.out.print("Novo Tipo: ");
//    String tipo = sc.nextLine();
//
//    System.out.print("Nova Observação: ");
//    String obs = sc.nextLine();
//
//    Medicao m = new Medicao(data, glicose, tipo, obs);
//
//    sistema.atualizar(id, m);
//}
//
//        } while (op != 0);
//
//        System.out.println("Encerrado.");
    
     TelaCadastro tela = new TelaCadastro();
        tela.setVisible(true); 
     
     
     }
}
