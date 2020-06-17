/**
 * Class which implements a queue using the array data structure.
 * @param <E> the type of element.
 */
public class ArrayListQueue<E> implements Queue<E> {
    private E[] list;
    private int maxCapacity = 2;
    private int front = 0;
    private int rear = 0;
    private int currSize = 0;

/**
 * constructor to create an empty array queue.
 */
    public ArrayListQueue() {
        list = (E[]) new Object[maxCapacity];
    }

/**
 * Method to return the size of the queue.
 * @return the size of the queue.
 */
    public int size() {
        return list.length;
    }

/**
 * Method to check if the queue is empty.
 * @return true if the queue is empty, false otherwise.
 */
    public boolean isEmpty() {
        if (currSize == 0) {
            return true;
        }
        else {
            return false;
        }
    }

/**
 * Method to get the first element in the queue.
 * @return the first element in the queue.
 */
    public E first() {
        return list[front];
    }

/**
 * Method to add an element to the end of the queue.
 * @param E the element to add to the end of the queue.
 */
    public void enqueue(E node) throws IllegalStateException {
        if (currSize == maxCapacity) {
            throw new IllegalStateException("Queue is full!");
        }
        else {
            list[rear] = node;
            rear = (rear + 1) % maxCapacity;
            currSize++;
        }
    }

/**
 * Method to remove an element from the queue.
 * @param E the element to remove from the queue. 
 */
    public E dequeue() {
        if (currSize == 0) {
            return null;
        }
        else {
            E e = list[front];
            front = (front + 1) % maxCapacity;
            currSize--;
            return e;
        }
    }
}