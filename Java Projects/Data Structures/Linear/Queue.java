/**
 * Interface that represents the queue data structure in java.
 * @param <E> the element type.
 */

public interface Queue<E> {
    int size();
    boolean isEmpty();
    E first();
    void enqueue(E node);
    E dequeue();
}