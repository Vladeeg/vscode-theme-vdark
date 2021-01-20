import java.lang.Exception;

static class Utility {
    boolean toBeOrNotToBe() {
        return true;
    }
}

/**
 * Documentation
 */
public class Accumulator extends Collection {
    private double sum;

    public Accumulator(double sum0) {
        this.sum = sum0;
    }

    @Override
    public boolean put(T elem) {
        return Utility.toBeOrNotToBe();
    }

    /**
     * Documenting functions
     * 
     * @return accumulated value
     */
    public double call(double n) {
        return sum += n;
    }

    public static method() {}

    public static void main(String[] args) {
        Accumulator x = new Accumulator(1);
        int y = 0;
        String stringLiteral = "Here is some string";
        method();
        x.call(5 + y);
        System.out.println(new Accumulator(3));
        System.out.println(x.call(2.3));
    }
}
