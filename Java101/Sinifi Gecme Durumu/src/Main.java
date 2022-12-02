import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, tur, kim, muz, dersAdedi=5, count=0;
        double avarage;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Matematik Notunuzu Girin: ");
        mat = input.nextInt();
        if(mat>100 || mat<0){
            System.out.println("Hatalı giriş yaptınız");
            count ++;
            mat = 0;
        }
        System.out.print("Lütfen Fizik Notunuzu Girin: ");
        fiz = input.nextInt();
        if(fiz>100 || fiz<0){
            System.out.println("Hatalı giriş yaptınız");
            count ++;
            fiz = 0;
        }
        System.out.print("Lütfen Türkçe Notunuzu Girin: ");
        tur = input.nextInt();
        if(tur>100 || tur<0){
            System.out.println("Hatalı giriş yaptınız");
            count ++;
            tur = 0;
        }
        System.out.print("Lütfen Kimya Notunuzu Girin: ");
        kim = input.nextInt();
        if(kim>100 || kim<0){
            System.out.println("Hatalı giriş yaptınız");
            count ++;
            kim=0;
        }
        System.out.print("Lütfen Müzik Notunuzu Girin: ");
        muz = input.nextInt();
        if(muz>100 || muz<0){
            System.out.println("Hatalı giriş yaptınız");
            count ++;
            muz=0;
        }


        dersAdedi = dersAdedi - count;

        avarage = (mat + fiz + tur + kim + muz) / dersAdedi;
        if ( avarage <= 55) {
                System.out.println("Kaldınız :/ ");
        } else {
                System.out.println("Tebrikler, geçtiniz :)");
        }
        System.out.println(" Ortalamanız: " + avarage);
    }
}