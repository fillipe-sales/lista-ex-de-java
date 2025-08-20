package Exercicio;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Digite um número inteiro: ");
	int valor1 = in.nextInt();
	
	System.out.println("Digite um número inteiro: ");
	int valor2 = in.nextInt();
	
	int soma = valor1 + valor2;
	
	System.out.println("A soma entre os dois números é: " + soma);
	
	in.close();
	
	
	}

}
