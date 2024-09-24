package A;

public class Main {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();

        Thread twoThread = new Thread(new DivisibilityChecker(numberPrinter, 2, "Number divisible by 2: "));
        Thread threeThread = new Thread(new DivisibilityChecker(numberPrinter, 3, "Number divisible by 3: "));
        Thread fourThread = new Thread(new Thread(new DivisibilityChecker(numberPrinter, 4, "Number divisible by 4: ")));
        Thread fiveThread = new Thread(new Thread(new DivisibilityChecker(numberPrinter, 5, "Number divisible by 5: ")));
        Thread printNumberThread = new Thread(new PrintNumber(numberPrinter));

        twoThread.start();
        threeThread.start();
        fourThread.start();
        fiveThread.start();
        printNumberThread.start();
    }
}

