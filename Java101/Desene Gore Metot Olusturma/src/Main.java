import java.util.Scanner;

public class Main {
    static void pattern(int number, int result, int tempNumber) {
        if(tempNumber <= 0) {
            System.out.print(result + " ");
            result += 5;
            if(result == number) {
                System.out.print(result + " ");
                return;
            }
        }else if(tempNumber > 0) {
            System.out.print(result + " ");
            result -= 5;
            if (result <= 0) {
                tempNumber = result;
            }
        }
        pattern(number,result,tempNumber);
    }

    public static void main(String[] args) {
        int number, result, tempNumber;

        Scanner input = new Scanner(System.in);
        System.out.print("Pattern oluşturmak istediğiniz sayıyı giriniz : ");
        number = input.nextInt();

        result = number;
        tempNumber = number;

        if(number == 0) {
            System.out.println("0 ile pattern oluşturamıyoruz, matematiği Java'da da bükemiyoruz.");
        }else {
            pattern(number,result,tempNumber);
        }
    }
}