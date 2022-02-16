import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>(new OrderByNameComparator());

        books.add(new Book("Ulysess", 600, "James Joyce", 1999));
        books.add(new Book("Boyle Soyledi Zerdust", 250, "Nietzsche", 1900));
        books.add(new Book("Marsli", 350, "Andy Weir", 2015));
        books.add(new Book("Yaratici Tur", 230, "David Eagleman", 2019));
        books.add(new Book("Cennetin Ejderleri", 240, "Carl Sagan", 1975));

        System.out.println("-------------------");
        System.out.println("İsmine göre sıralama");
        for (Book book : books) {
            System.out.print(book.getBookName() + " " + book.getPageNumber() + " " + book.getAuthor() + " " + book.getPublishDate());
            System.out.println();
        }


        TreeSet<Book> books1 = new TreeSet<>(new OrderByNumberComparator());

        books1.addAll(books);

        System.out.println("-------------------");
        System.out.println("Sayfa sayısına göre sıralama");
        for (Book book : books1) {
            System.out.print(book.getBookName() + " " + book.getPageNumber() + " " + book.getAuthor() + " " + book.getPublishDate());
            System.out.println();
        }

    }
}
