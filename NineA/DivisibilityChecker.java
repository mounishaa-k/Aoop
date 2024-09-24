package A;

public class DivisibilityChecker implements Runnable {
    private final NumberPrinter numberPrinter;
    private final int divisor;
    private final String message;

    public DivisibilityChecker(NumberPrinter numberPrinter, int divisor, String message) {
        this.numberPrinter = numberPrinter;
        this.divisor = divisor;
        this.message = message;
    }

    @Override
    public void run() {
        while (!numberPrinter.isDone()) {
            synchronized (numberPrinter) {
                int current = numberPrinter.getCurrentNumber();
                if (current % divisor == 0) {
                    System.out.println(message + current);
                    numberPrinter.increment();
                }
            }
        }
    }
}



