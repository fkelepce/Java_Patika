import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        int totalDeger=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Mükemmel Sayı kontrolü yapılacak değeri giriniz: ");
        number = input.nextInt();

        for ( int i = 1; i < number; i++){
            if (number%i == 0){
                totalDeger += i;
            }
        }

        if ( totalDeger == number ) {
            System.out.println(number + " Harika sayıdır");
        } else  {
            System.out.println(number + " Harika sayı falan değildir.");
        }
    }
}