import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        int total=0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Lütfen Negatif Olana Kadar Birkaç Değer Giriniz: ");
            k = input.nextInt();
            if ( (k % 2 == 0) && (k % 4 == 0) ){
                total += k;
            }
        } while ( k > 0);

        System.out.println("Girilen değerlerden çift olup 4'e tam bölünen sayılar toplamı: " + total);
    }
}