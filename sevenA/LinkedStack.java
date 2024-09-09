package a;

import java.util.LinkedList;

public class LinkedStack<E> implements StackInterface<E> {
    private LinkedList<E> list;

    public LinkedStack() {
        list = new LinkedList<>();
    }

    @Override
    public void add(E item) {
        list.addFirst(item);
        System.out.println("Added item: " + item);
    }

    @Override
    public E remove() {
        if (isStackEmpty()) {
            System.out.println("Cannot remove from an empty stack.");
            return null;
        }
        E item = list.removeFirst();
        System.out.println("Removed item: " + item);
        return item;
    }

    @Override
    public E top() {
        if (isStackEmpty()) {
            System.out.println("Stack is currently empty.");
            return null;
        }
        E item = list.getFirst();
        System.out.println("Top item: " + item);
        return item;
    }

    @Override
    public boolean isStackEmpty() {
        return list.isEmpty();
    }
}

