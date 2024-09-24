package A;

public class NumberPrinter {
    private int currentNumber = 1;
    private final int MAX_NUMBER = 15;

    public synchronized int getCurrentNumber() {
        return currentNumber;
    }

    public synchronized void increment() {
        currentNumber++;
    }

    public boolean isDone() {
        return currentNumber > MAX_NUMBER;
    }
}



