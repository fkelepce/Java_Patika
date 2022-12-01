import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvOrani1 = 0.18, kdvOrani2 =0.08, kdvliTutar, kdvTutari, oran;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücreti Girin: ");
        tutar = input.nextDouble();

        kdvTutari = tutar > 1000 ? tutar *kdvOrani2 : tutar*kdvOrani1;
        kdvliTutar = tutar + kdvTutari;
        oran = tutar>1000 ? kdvOrani2 : kdvOrani1 ;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı: " + oran);
        System.out.println("KDV Tutarı : " + kdvTutari);
        System.out.println("KDV'li Tutar: " + kdvliTutar);
    }
}