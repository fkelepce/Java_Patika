import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("İki Şehrin Hikayesi", 10, "Charles Dickens", 1859));
        bookList.add(new Book("Yüzüklerin Efendisi", 800, "Tolkien", 1955));
        bookList.add(new Book("Küçük Prens", 50, "Exupery", 1943));
        bookList.add(new Book("The Hobbit", 550, "Tolkien", 1937));
        bookList.add(new Book("Kızıl Köşkün Rüyası", 80, "Cao", 1790));
        bookList.add(new Book("Ayişe", 145, "Haggard", 1887));
        bookList.add(new Book("Abasıyanık", 250, "Sait Faik", 2018));
        bookList.add(new Book("Kartal", 885, "higgins", 1975));
        bookList.add(new Book("Anılarım", 500, "İmparator Fatih Terim", 2023));
        bookList.add(new Book("Hatıralarım", 350, "Tevfik Paşa", 1924));
        Map<String,String> bookMap = new HashMap<>();
        bookList.stream().forEach(book->bookMap.put(book.getBookName(), book.getAuthorName()));
        for(String s:bookMap.keySet()){
            System.out.println("Kitap adı: "+s+"\nYazarı: "+bookMap.get(s));
        }
        System.out.println("--------------------------------");
        List<Book> listBook = bookList.stream().filter(book->book.getPageNumber()>100).toList();
        listBook.stream().forEach(b->System.out.println("Kitap Adi : "+b.getBookName()+" | " +
                "Sayfa Sayisi : "+b.getPageNumber()+" | "+
                "Yazar : "+b.getAuthorName()+" | "+
                "Yayin Tarihi : "+b.getReleaseDate()));
    }
}