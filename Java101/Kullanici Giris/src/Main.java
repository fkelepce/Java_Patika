import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adını Giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifre Giriniz: ");
        password = input.nextLine();

        if( (userName.equals("patika")) && (password.equals("Java123")) ){
            System.out.print("Giriş Yaptınız!");
        } else {
            Scanner inpSelect = new Scanner(System.in);
            System.out.print("Bilgiler Hatalı. Şifre yenilemek istiyorsanız 1'i giriniz: ");
            select = inpSelect.nextInt();
            if ( (select == 1) ) {
                Scanner inp = new Scanner(System.in);
                System.out.print("Parolayı giriniz: ");
                password = inp.nextLine();
                    if (password.equals("Java123")){
                    System.out.println("Parola eski parola ile aynı olamaz,tekrar deneyin");
                    } else {
                    System.out.println("Parola başarılı bir şekilde oluşturuldu. Yeni parola: " + password);
                    }
            } else {
                System.out.print("Giriş yapamadınız :/ ");
            }
        }
    }
}