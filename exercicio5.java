package Atividades;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.printf("A média entre %.1f e %.1f é igual a %.1f%n", nota1, nota2, media);

        scanner.close();
    }
}
