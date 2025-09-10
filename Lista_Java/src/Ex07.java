import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        double numero = sc.nextDouble();

        double dobro = numero * 2;
        double tercaParte = numero / 3;

        System.out.println("O dobro do nùmero " + numero + " é: " + dobro +
                            " | A terça parte é: " + tercaParte);

        sc.close();



    }
}
