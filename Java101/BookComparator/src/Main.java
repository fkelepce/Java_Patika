import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Book> books=new TreeSet<Book>();

        Book book1=new Book("Küçük Ali",500,"Seyfettin Mehmet","2002");
        Book book2=new Book("Veli Mehmet",50,"Küçük Emrah","2007");
        Book book3=new Book("Abasıyanık",566,"Sait Faik","2025");
        Book book4=new Book("1984",2034,"Bendeniz","2000");
        Book book5=new Book("İkibinotuzdört",2035,"Sen çöl","1999");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println("Ada göre sıralama : ");
        for(Book book:books){

            System.out.println("Kitap Adı : "+book.getName()+
                    ",\t Sayfa Sayısı : "+book.getPage()+
                    ",\t Yazarın İsmi : "+book.getAuthor()+
                    ",\t Yayın Tarihi : "+ book.getReleaseDate());
        }


        TreeSet<Book> books2=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage() - o2.getPage();
            }
        });
        books2.add(book1);
        books2.add(book2);
        books2.add(book3);
        books2.add(book4);
        books2.add(book5);
        System.out.println("----------------------------------");
        System.out.println("Sayfa sayısına göre sıralama :");
        for (Book book:books2) {
            System.out.println("Kitap adı : " + book.getName() +
                    ",\t Sayfa Sayısı : " + book.getPage() +
                    ",\t Yazarın İsmi : " + book.getAuthor() +
                    ",\t Yayın Tarihi : " + book.getReleaseDate());
        }
    }
}