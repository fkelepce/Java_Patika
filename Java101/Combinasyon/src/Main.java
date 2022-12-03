import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r, nEksiR;
        int nTotal=1, rTotal=1, nEksiRTotal=1;
        double combinasyon;

        Scanner input = new Scanner(System.in);
        System.out.print("Kombinasyon ilk değerini giriniz: ");
        n = input.nextInt();

        System.out.print("Kombinasyon ikinci değerini giriniz: ");
        r = input.nextInt();

        nEksiR = ( n - r);

        for (int i=1; i <=n; i++){
            nTotal *= i;
        }

        for ( int i= 1; i <=r; i++){
            rTotal *= i;
        }

        for ( int i=1; i <= nEksiR; i++){
            nEksiRTotal *= i;
        }

        combinasyon = nTotal / (rTotal * nEksiRTotal);

        System.out.println("Kombinasyon sonucu: " + combinasyon);


    }
}