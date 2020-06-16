/**
 * Interface that represents the queue data structure in java.
 * @param <E> the element type.
 */

public interface Queue<E> {
    int size(); //the size of the queue.
    boolean isEmpty(); //check to see if the queue is empty.
    E first(); //returns the first element in the queue.
    void enqueue(E node); //adds an element to the end of the queue.
    E dequeue(); //returns the element removed in the queue.
}