import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz: ");
        int base = input.nextInt();

        System.out.print("Tavan sayısını giriniz: ");
        int raisedPower = input.nextInt();

        int result = power(base, raisedPower);
        System.out.println("İşlem sonucu: " + result);

    }

    public static int power(int base, int raisedPower) {
        if ( raisedPower == 0) {
            return 1;
        } else {
            return base * power(base, raisedPower-1);
        }
    }
}