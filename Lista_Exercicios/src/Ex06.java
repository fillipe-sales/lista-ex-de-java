import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();

            int antecessor = numero - 1;
            int sucessor = numero + 1;

            System.out.println("Você digitou o número: " + numero +
                    " | Seu antecessor é: " + antecessor +
                    " | Seu sucessor é: " + sucessor);

            sc.close();
        }
    }

