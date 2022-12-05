import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        double result=0, i=1.0;

        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        number = input.nextInt();

        while ( i != (number +1)) {
            result = result + (1.0 / i);
            i++;
        }

        System.out.println("harmonik değer = " + result);
    }
}