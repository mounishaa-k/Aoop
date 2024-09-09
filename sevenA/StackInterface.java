package a;

public interface StackInterface<E> {
    void add(E item);
    E remove();
    E top();
    boolean isStackEmpty();
}
