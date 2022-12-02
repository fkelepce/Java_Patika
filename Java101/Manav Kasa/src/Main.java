import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutFiyat=2.14, elmaFiyat=3.67, domatesFiyat=1.11, muzFiyat=0.95, patlicanFiyat=5, toplamFiyat ;
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız: ");
        armutKilo = input.nextInt();
        System.out.print("Kaç kilo elma aldınız: ");
        elmaKilo = input.nextInt();
        System.out.print("Kaç kilo domates aldınız: ");
        domatesKilo = input.nextInt();
        System.out.print("Kaç kilo muz aldınız: ");
        muzKilo = input.nextInt();
        System.out.print("Kaç kilo patlıcan aldınız: ");
        patlicanKilo = input.nextInt();

        toplamFiyat = ( armutFiyat * armutKilo) + ( elmaFiyat * elmaKilo ) + ( domatesFiyat * domatesKilo ) + ( muzFiyat * muzKilo ) +
                ( patlicanFiyat * patlicanKilo);

        System.out.println("Toplam fiyat :" + toplamFiyat);
    }
}