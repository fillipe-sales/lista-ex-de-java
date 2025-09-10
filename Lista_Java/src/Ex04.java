import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = sc.nextInt();

        System.out.println("Digite um número inteiro: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma dos dois números é: " + soma);

        sc.close();

    }
}
