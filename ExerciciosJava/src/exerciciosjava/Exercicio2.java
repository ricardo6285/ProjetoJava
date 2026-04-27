package exerciciosjava;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner grava = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = grava.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = grava.nextInt();

        if (num1 > num2) {
            System.out.println("Maior: " + num1);
        } else {
            System.out.println("Maior: " + num2);
        }

    }
}


