public class Program implements Runnable {
    int index;

    public Program() {
        this.index = 0;
    }

    @Override
    public synchronized void run() {
        int number = Main.arrayList.get(this.index);

        if (number % 2 == 0)
            Main.even.add(number);
        else
            Main.odd.add(number);

        System.out.println(
                " Even Size:" + Main.even.size()
                        + " Odd Size: " + Main.odd.size());
        this.index++;
    }
}
