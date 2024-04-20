import java.util.ArrayList;
import java.util.Scanner;

public class SumFirstLastDigits {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String input = sc.nextLine();
        ArrayList<Character> digits = new ArrayList<Character>();

        for (int i = 0; i < input.length(); i++) {
            digits.add(input.charAt(i));
        }

        ArrayList<Integer> intDigits = new ArrayList<>();
        for (Character digit : digits) {
            intDigits.add(Character.getNumericValue(digit));
        }
        int sum = intDigits.getFirst() + intDigits.getLast();
        System.out.println(sum);
    }
}
