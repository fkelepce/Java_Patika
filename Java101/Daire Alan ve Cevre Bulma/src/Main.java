import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, a;
        double alan, cevre, pi=3.14, daireDilimiAlani ;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();

        System.out.print("Daire dilimi açısını giriniz: ");
        a = input.nextInt();

        a = ( a > 360 ) ? 0 : a ;

        alan = pi * r * r;
        cevre = 2* pi * r;
        daireDilimiAlani = (pi * (r * r)* a) / 360;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Cevresi: " + cevre);
        System.out.println("Daire Diliminin Alanı: " + daireDilimiAlani);
    }
}