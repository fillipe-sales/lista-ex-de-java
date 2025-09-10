import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Largura da parede (m): ");
        double largura = sc.nextDouble();

        System.out.print("Altura da parede (m): ");
        double altura = sc.nextDouble();

        double area = largura * altura;
        double tinta = area / 2;

        System.out.printf("Área: %,.2f m²%n", area);
        System.out.printf("Quantidade de tinta necessária: %,.2f litros%n", tinta);


        sc.close();
    }
}

