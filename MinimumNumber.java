import java.util.ArrayList;
import java.util.Collections;

public class MinimumNumber {
    private int a;
    private int b;
    private int c;

    public MinimumNumber() {
    }

    public MinimumNumber(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void findSmallestNumber() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println(Collections.min(list));
    }


}
