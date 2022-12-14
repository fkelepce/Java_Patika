import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={15,12,788,1,-1,-778,2,0};

        int number, min=arr[0], max=arr[0];

        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number=input.nextInt();

        int[] newArr={15,12,788,1,-1,-778,2,0,number};
        Arrays.sort(newArr);
        if (number == newArr[0]) {
            min = number;
            max=newArr[Arrays.binarySearch(newArr,number)+1];
        } else if (number == newArr[newArr.length-1]) {
            min=newArr[Arrays.binarySearch(newArr,number)-1];
            max = number;
        } else {
            min = newArr[Arrays.binarySearch(newArr, number) - 1];
            max = newArr[Arrays.binarySearch(newArr, number) + 1];
        }

        System.out.println("The closest smaller number: " +min);
        System.out.println("The closest bigger  number: " +max);
    }
}