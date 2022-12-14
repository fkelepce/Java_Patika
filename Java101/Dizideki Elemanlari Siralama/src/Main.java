import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int eleman, boyut;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kaç elamnlı dizi oluşturmak istediiğiniz giriniz: ");
        boyut=input.nextInt();

        int[] list=new int[boyut];

        for (int i=0 ; i<list.length;i++){
            System.out.print("Girmek istediğiniz " +(i+1) + ". elemanı giriniz: ");
            eleman=input.nextInt();
            list[i]=eleman;
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}