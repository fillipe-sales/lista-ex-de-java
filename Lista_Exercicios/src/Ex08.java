import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância em metros: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;
        double quilometros = metros / 1000;

        System.out.printf("A distância digitada em metros foi de: %.2f m | " +
                        "Convertida para centímetros: %.2f cm | " +
                        "Convertida para milímetros: %.2f mm | " +
                        "Convertida para quilômetros: %.2f km%n",
                metros, centimetros, milimetros, quilometros);

        sc.close();


    }
}

