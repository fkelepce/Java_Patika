public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "000");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "111");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "101", "FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100,80,50,50,50,100);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "124", "4", tarih, fizik, biyo);
        s2.addBulkExamNote(30,40,50,50,60,0);
        s2.isPass();
    }
}