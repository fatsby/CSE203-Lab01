import java.util.Scanner;

public class SumEven {
    private int[] a;

    public SumEven() {
    }

    public SumEven(int[] a) {
        this.a = a;
    }

    public int getSumEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to sum even?");
        int n = sc.nextInt();
        a = new int[n]; // Initialize the array here with the size n
        int sum = 0;
        System.out.println("Enter the numbers");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }
}