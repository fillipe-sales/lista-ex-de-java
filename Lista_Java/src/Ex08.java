import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância em metros: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100;
        double quilometros = metros / 1000;

        System.out.printf("A distância digitada em metros foi de: %.2f | " +
                        "Convertida para centímetros: %.2f | " +
                        "Convertida para quilômetros: %.2f%n",
                        metros, centimetros, quilometros);

        sc.close();


    }
}
