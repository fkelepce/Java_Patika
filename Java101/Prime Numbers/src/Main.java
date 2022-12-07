import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Asal olup olmadığını merak ettiğiniz sayıyı girin: ");
        int sayi = input.nextInt();
        isPrime(sayi, 2);
    }
    static boolean isPrime(int sayi, int i) {
        if (i == sayi) {
            System.out.println(sayi + "  asal sayıdır.");
            return true;
        } else if (sayi % i == 0) {
            System.out.println(sayi + "  asal sayı değildir.");
            return false;
        }
        return isPrime(sayi, i + 1);
    }
}