import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        while (true) {
            list.add(new ArrayList<Integer>(100000));
            Thread.sleep(1);
        }
    }
}
