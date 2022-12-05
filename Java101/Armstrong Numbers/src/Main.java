import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamakları Toplanacak Sayıyı Giriniz: ");
        int number = input.nextInt();
        int tempNumber ;
        int result = 0;

        while ( number != 0){
            tempNumber = number %10;
            number /= 10;
            result += tempNumber;
        }
        System.out.println("Basamak toplamı " + result);
    }
}