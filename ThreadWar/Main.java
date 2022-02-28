import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static ArrayList<Integer> odd = new ArrayList<>();
    static ArrayList<Integer> even = new ArrayList<>(10000);

    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            arrayList.add(i);
        }

        Program program = new Program();
        ExecutorService executor = Executors.newFixedThreadPool(4);


        for (Integer i: arrayList) {
            executor.execute(program);
        }

        /*
        for (int i = 0; i < arrayList.size(); i++) {
            executor.execute(program);
        }

         */


    }
}
