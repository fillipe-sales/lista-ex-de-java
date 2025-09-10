import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto de dinheiro você possui na carteira (R$)? ");
        double reais = sc.nextDouble();

        double cotacaoDolar = 3.45;
        double dolares = reais / cotacaoDolar;

        System.out.printf("Com R$ %.2f você pode comprar US$ %.2f%n", reais, dolares);

        sc.close();
    }
}
