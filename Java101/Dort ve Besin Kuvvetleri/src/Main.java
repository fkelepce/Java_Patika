import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("4'ün ve 5'in kuvvetlerini O'dan itibaren sıralacayağımız sayıyı giriniz: ");
        n = input.nextInt();

        for ( int i = 1; i <= n ; i*= 4){
            System.out.println("Girilen sayının dördüncü kuvveti: " + i);
        }

        System.out.println("**********************");

        for ( int i = 1; i <= n ; i*= 5){
            System.out.println("Girilen sayının beşinci kuvveti: " + i);
        }

    }
}