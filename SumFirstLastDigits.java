
public class SumFirstLastDigits {


    private long number;

    public SumFirstLastDigits() {

    }

    public SumFirstLastDigits(long number) {
        this.number = number;
    }

    public int sumFirstLastDigits() {
        int first = (int) number;
            while (first>10) first/=10;
        int last = (int) (number % 10);
        return first + last;
    }


}
