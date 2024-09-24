package A;

public class PrintNumber implements Runnable {
    private final NumberPrinter numberPrinter;

    public PrintNumber(NumberPrinter numberPrinter) {
        this.numberPrinter = numberPrinter;
    }

    @Override
    public void run() {
        while (!numberPrinter.isDone()) {
            synchronized (numberPrinter) {
                int current = numberPrinter.getCurrentNumber();
                if (current % 2 != 0 && current % 3 != 0 && current % 4 != 0 && current % 5 != 0) {
                    System.out.println("Number: " + current);
                    numberPrinter.increment();
                }
            }
        }
    }
}



