import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A média das suas duas notas é de: " + media);

        sc.close();


    }
}
