import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma işlemi sonucu: " + result );
        return result;
    }

    static int multiply(int a, int b) {
        int result = a*b;
        System.out.println("Çarpma işlemi sonucu: " + result);
        return result;
    }

    static int divide(int a, int b) {
        if ( b== 0) {
            System.out.println("0'a hangi hesap makinesinin böldüğünü gördün knk :/");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme işlemi sonucu: " + result);
        return result;
    }

    static int power(int a, int b){
        int result= 1;
        for ( int i=1; i<= b; i++){
            result *= a;
        }
        System.out.println("Üs alma işlem sonucu: " + result);
        return result;
    }

    static int mode( int a, int b) {
        int result = a % b;
        System.out.println("Mod alma işlem sonucu: " + result);
        return result;
    }

    static void  rectangleCalc(int a, int b) {
        System.out.println("Dikdörtgen çevresi: " + ( 2*(a+b)));
        System.out.println("Dikdörtgen alanı: " + (a*b));
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama işlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma İşlemi\n"
                + "7- Dikdörtgen Alan ve Çevre\n"
                + "0- Çıkış Yap";

        System.out.println(menu);
        while(true) {
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();

            if (select==0) {
                break;
            }

            System.out.print("İlk Sayıyı Giriniz: ");
            int a = input.nextInt();
            System.out.print("İkinci Sayıyı Giriniz: ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    multiply(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mode(a, b);
                    break;
                case 7:
                    rectangleCalc(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz!!!");
            }
        }
        System.out.println("Görüşmek üzere Google tanımazlar.");
    }
}