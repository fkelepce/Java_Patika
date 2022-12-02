import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo, boy, bmi;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu kg cinsinden giriniz: ");
        kilo = input.nextDouble();

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        bmi = kilo / (boy* boy);
        System.out.println("Vücut Kitle Indeksiniz: " + bmi);

    }
}