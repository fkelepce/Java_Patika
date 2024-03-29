import java.util.ArrayList;

public class ThreadOperations extends Thread{

    private ArrayList<Integer> odd = new ArrayList<>();
    private ArrayList<Integer> even = new ArrayList<>();
    private ArrayList<Integer> general = new ArrayList<>();

    public ThreadOperations (ArrayList<Integer> general) {
        this.general = general;
    }

    @Override
    public void run() {

        for (int i = 0; i < general.size(); i++) {

            if (general.get(i) % 2 == 0) {
                even.add(general.get(i));
            } else {
                odd.add(general.get(i));
            }

        }

        printOdd();
        printEven();

    }

    public synchronized void printOdd() {
        System.out.println(this.odd);

    }

    public synchronized void printEven() {
        System.out.println(this.even);
    }

}
