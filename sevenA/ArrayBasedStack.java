package a;

import java.util.Arrays;

public class ArrayBasedStack<E> implements StackInterface<E> {
    private Object[] elements;
    private int count;
    private static final int DEFAULT_CAPACITY = 15;

    public ArrayBasedStack() {
        elements = new Object[DEFAULT_CAPACITY];
        count = 0;
    }

    @Override
    public void add(E item) {
        if (count == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[count++] = item;
        System.out.println("Element added: " + item);
    }

    @Override
    public E remove() {
        if (isStackEmpty()) {
            System.out.println("Stack is empty. Nothing to remove.");
            return null;
        }
        E item = (E) elements[--count];
        elements[count] = null;
        System.out.println("Element removed: " + item);
        return item;
    }

    @Override
    public E top() {
        if (isStackEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        E item = (E) elements[count - 1];
        System.out.println("Current top: " + item);
        return item;
    }

    @Override
    public boolean isStackEmpty() {
        return count == 0;
    }
}

