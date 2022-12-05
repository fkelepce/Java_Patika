import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maks=0;
        int min=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int n = input.nextInt();

        for ( int i=1; i<= n; i++){
            System.out.print(i + ". değeri giriniz: ");
            int number = input.nextInt();
            if ( i==1) {
                maks = number;
                min = number;
            }
            if ( number > maks ) {
                maks = number;
            } else if ( number < min ) {
                min = number;
            }
        }

        System.out.println( "Minimum sayı= " + min + " Maksimum sayı= " + maks);
    }
}