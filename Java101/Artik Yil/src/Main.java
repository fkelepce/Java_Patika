import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        boolean artikYil;

        Scanner input = new Scanner(System.in);
        System.out.print(" Artık kontrolü yapılacak yılı giriniz: ");
        yil = input.nextInt();

        if ( (yil %4 ==0) ) {
            if ( yil % 400 == 0 ) {
                System.out.println( yil + " artık bir yıldır");
            } else if ( ( yil % 100 ==0 || yil%200==0 || yil % 300==0 )) {
                artikYil = false;
                System.out.println(yil + " artık bir yıl değildir");
            } else {
                artikYil = true;
                System.out.println(yil + " artık bir yıldır");
            }
        } else  {
            artikYil = false;
            System.out.println( yil + " artık bir yıl değildir.");
        }
    }
}