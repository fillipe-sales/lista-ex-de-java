import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu salário: ");
        double salario = sc.nextDouble();

        System.out.println("Nome do funcionário: " + nome + " | Salário: R$ " + salario);

        sc.close();
    }
}
