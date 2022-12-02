import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yas, mesafe, yolculukTipi, indirim;
        double ucret;

        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Tek yön ise 1, gidiş-dönüş ise 2 olarak giriniz: ");
        yolculukTipi = input.nextInt();

        ucret = mesafe * 0.10;

        if ( mesafe < 0 ) {
            System.out.println(" Mesafeyi hatalı girdiniz");
        } else {
            if ( yolculukTipi == 1 ) {
                if (yas < 12) {
                    ucret = ucret * 0.5;
                    System.out.println("Ücret" + ucret);
                } else if (yas >= 12 && yas < 24) {
                    ucret = ucret * 0.9;
                    System.out.println("Ücret" + ucret);
                } else if (yas < 65) {
                    ucret = ucret;
                    System.out.println("Ücret" + ucret);
                } else {
                    ucret = ucret * 0.7;
                    System.out.println("Ücret" + ucret);
                }
            } else if ( yolculukTipi == 2) {
                if (yas < 12) {
                    ucret = (ucret * 0.5 * 2) * 0.8 ;
                    System.out.println("Ücret" + ucret);
                } else if (yas >= 12 && yas < 24) {
                    ucret = (ucret * 0.9 * 2) * 0.8;
                    System.out.println("Ücret" + ucret);
                } else if (yas < 65) {
                    ucret = (ucret * 2) * 0.8;
                    System.out.println("Ücret" + ucret);
                } else {
                    ucret = (ucret * 0.7 * 2) * 0.8;
                    System.out.println("Ücret" + ucret);
                }
            } else {
                System.out.print("Hatalı giriş yaptınız");
            }
        }



    }
}