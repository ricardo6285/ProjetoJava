package aula01_04;

import java.util.Scanner;

public class replica_exercicio_consultorio {

    public static void main(String[] args) {
System.setProperty("file.encoding", "UTF-8");
        Scanner grava = new Scanner(System.in);

        String nome;
        int idade=0, op=0, op2=0, cpf=0;
        int febre=0, tosse=0, dor=0, coriza=0, faltadeAr=0, diagnostico = 0;

        do {
            System.out.println("Sistema de Identificação e Prevenção de Doenças de Inverno \n (não medico");
            System.out.println("=========== Cadastro do Paciente ===============");
            System.out.println("1 - Cadastrar Paciente");
            System.out.println("2 - Ver Diagnótico");
            System.out.println("3 - Ver Recomendações");
            System.out.println("4 - Informar Sintomas");
            System.out.println("5 - Sair");
            op = grava.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    nome = grava.next();

                    System.out.println("Digite seu cpf: ");
                    cpf = grava.nextInt();

                    System.out.println("Está com febre?\n 1-sim\n 2-não ");
                    febre = grava.nextInt();

                    System.out.println("Está com tosse?\n 1-sim\n 2-não ");
                    tosse = grava.nextInt();

                    System.out.println("Está com dor de garganta?\n 1-sim\n 2-não ");
                    dor = grava.nextInt();

                    System.out.println("Está com Coriza?\n 1-sim\n 2-não ");
                    coriza = grava.nextInt();

                    System.out.println("Está com falta de ar?\n 1-sim\n 2-não ");
                    faltadeAr = grava.nextInt();
                    break;

                case 2:
                    if (faltadeAr == 1) {
                        System.out.println("Situação mais grave");
                        diagnostico = 1;
                    } else if (febre == 1 && tosse == 1 && dor == 1) {
                        System.out.println("Gripe");
                        diagnostico = 2;
                    } else if (coriza == 1 && tosse == 1) {
                        System.out.println("Resfriado");
                        diagnostico = 3;
                    } else {
                        System.out.println("Alergia");
                        diagnostico = 4;
                    }
                    break;

                case 3:
                    if (diagnostico == 1) {
                        System.out.println("Procure um medico");
                    } else if (diagnostico == 2) {
                        System.out.println("Beber bastante liquido");
                    } else if (diagnostico == 3) {
                        System.out.println("Evitar locais fechados");
                    } else {
                        System.out.println("Manter higiene");
                    }
                    break;
                case 4:
                    System.out.println("Está com febre? 1-sim\n 2-não ");
                    febre = grava.nextInt();

                    System.out.println("Está com tosse? 1-sim\n 2-não ");
                    tosse = grava.nextInt();

                    System.out.println("Está com dor de garganta? 1-sim\n 2-não ");
                    dor = grava.nextInt();

                    System.out.println("Está com Coriza? 1-sim\n 2-não ");
                    coriza = grava.nextInt();

                    System.out.println("Está com falta de ar? 1-sim\n 2-não ");
                    faltadeAr = grava.nextInt();
                    break;
            }
        } while (op != 4);

    }

}
