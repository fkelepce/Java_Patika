import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        double avarage=0, count=0, total=0;

        Scanner input = new Scanner(System.in);
        System.out.print("3'e ve 4'e bölen sayıların ortalamasını alacağımız değeri girin: ");
        k = input.nextInt();

        for ( int i=1; i <= k; i++){
            if ( (i % 3 == 0) && ( i % 4 == 0) ) {
                count ++;
                total = total + i;
            }
        }
        avarage = total / count;
        System.out.println( "Ortalama Değer: " + avarage);
    }
}