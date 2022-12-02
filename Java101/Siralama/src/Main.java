import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı a Değeri Olarak Giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci Sayıyı b Değeri Olarak Giriniz: ");
        b = input.nextInt();
        System.out.print("Üçüncü Sayıyı c Değeri Olarak Giriniz: ");
        c = input.nextInt();

        if ( (a > b) && ( b > c) ) {
            System.out.println( "a > b > c" );
        } else if ( (a > c) && ( c > b)) {
            System.out.println( "a > c > b");
        } else if (  (b > a) && ( a > c) ) {
            System.out.println( "b > a > c" );
        } else if ( (b > c ) && ( c > a) ) {
            System.out.println( "b > c > a");
        } else if ( (c > a) && ( a > b)) {
            System.out.println( "c > a > b");
        } else if ( (c > b) && ( b > a)) {
            System.out.println( "c > b > a " );
        } else {
            System.out.println("Lütfen eşit değerlerde sayılar girmeyiniz");
        }
    }
}