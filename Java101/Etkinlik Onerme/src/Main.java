import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sıcaklığı derece cinsinden girin: ");
        heat = input.nextInt();

        if (heat <= 5 ){
            System.out.println("Kayak");
        } else if ( heat <= 10) {
            System.out.println(" Sinema");
        } else if ( heat <= 15 ) {
            System.out.println("Sinema ve Piknik");
        } else if ( heat <= 25 ) {
            System.out.println("Piknik");
        } else {
            System.out.println("Yüzme");
        }
    }
}