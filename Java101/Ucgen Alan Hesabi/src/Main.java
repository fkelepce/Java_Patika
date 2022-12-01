import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double kenar1, kenar2, kenar3, alan, cevre, u;

        Scanner input = new Scanner(System.in);
        System.out.print("Kenar1 uzunluğunu giriniz: ");
        kenar1 = input.nextDouble();

        System.out.print("Kenar2 uzunluğunu giriniz: ");
        kenar2 = input.nextDouble();

        System.out.print("Kenar3 uzunluğunu giriniz: ");
        kenar3 = input.nextDouble();

        cevre = kenar1 + kenar2 + kenar3;

        u = cevre / 2;

        alan = Math.sqrt(u* (u-kenar1)* (u-kenar2)* (u-kenar3));

        System.out.println( "Üçgenin çevresi: " + cevre);
        System.out.println( "Üçgenin alanı: " + alan);

    }
}