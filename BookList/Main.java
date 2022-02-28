import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> bookArrayList = new ArrayList<>(10);
        Map<String, String> map = new HashMap<>();

        bookArrayList.add(new Book("Aslan", 150, "Victor", 1999));
        bookArrayList.add(new Book("Kaplan", 159, "Hector", 1969));
        bookArrayList.add(new Book("Hayal", 120, "Kalmender", 1996));
        bookArrayList.add(new Book("Meyal", 100, "Saloman", 2009));
        bookArrayList.add(new Book("Dust", 400, "Frig", 2013));
        bookArrayList.add(new Book("Map", 1950, "Kafka", 2010));
        bookArrayList.add(new Book("Iple", 255, "Heisenberg", 2013));
        bookArrayList.add(new Book("Kas", 84, "Jessie", 2015));
        bookArrayList.add(new Book("Makbure", 75, "Mike", 1896));
        bookArrayList.add(new Book("Makaron", 122, "Tyson", 1888));

        for (Book book : bookArrayList) {
            map.put(book.getBookName(), book.getAuthor());
        }

        bookArrayList.stream().filter(i -> i.getPageNumber() > 100).forEach(i -> System.out.println(i.getBookName()));
    }
}
