
//Nome dos integrantes: Edino Rogério RA:2401621, Fillipe Correa RA:2403395, João Pedro Vasconcelos RA:2404081, Ramon Barbosa RA:2404066


package Exercicio;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = in.nextLine();
		
		System.out.println("Digite o seu salário: ");
		int salario = in.nextInt();
		
		
		System.out.println("Nome: " + nome + ", salario: " + salario);
		
		in.close();
					
	}

}




