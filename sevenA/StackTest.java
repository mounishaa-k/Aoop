package a;

public class StackTest {
    public static void main(String[] args) {
        StackInterface<Double> linkedStack = new LinkedStack<>();
        StackInterface<Character> arrayStack = new ArrayBasedStack<>();

        System.out.println("Testing LinkedStack:");
        linkedStack.add(99.0);
        linkedStack.add(2.92);
        linkedStack.top();
        linkedStack.remove();
        linkedStack.top();
        linkedStack.remove();

        System.out.println("\nTesting ArrayBasedStack:");
        arrayStack.add('m');
        arrayStack.add('o');
        arrayStack.top();
        arrayStack.remove();
        arrayStack.top();
        arrayStack.remove();
    }
}

