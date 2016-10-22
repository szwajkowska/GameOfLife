package pl.ania;

public class Sum {

    private int sum;

    public Sum(int i) {
        sum = i;

    }

    public int add(int i) {

        return sum += i;
    }
}
