import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int n1, n2, i=1, k=1;
       int ebob=1;
       int ekok=1;

       Scanner input = new Scanner(System.in);
       System.out.print("Lütfen numara1'i girin: ");
       n1 = input.nextInt();
       System.out.print("Lütfen numara2'yi girin: ");
       n2 = input.nextInt();

       // EBOB hesaplama
       while(i <= n1){
           if ((n1%i==0) && (n2%i==0)) {
               ebob=i;
           }
           i++;
       }
       System.out.println("Ebob Değeri: " + ebob);



       // EKOK hesaplama

        while (k <= ( n1 * n2 )) {
            if((k % n1 == 0) && (k % n2 == 0)){
                ekok = k;
                break;
            }
            k++;
        }
        System.out.println("Ekok Değeri: " + ekok);
    }
}