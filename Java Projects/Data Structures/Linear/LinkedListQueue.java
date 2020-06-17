/**
 * Class which represents the queue data structure in java.
 */
public class LinkedListQueue<E> implements Queue<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<E>(); //Creates a singlylinkedlist
    
/**
 * Constructor for creating an empty queue.
 */
    public LinkedListQueue() {
        list.head = null;
        list.tail = null;
        list.size = 0;
    }

/**
 * Method to return the size of the queue.
 * @return the size of the queue.
 */
    public int size() {
        return list.size;
    }

/**
 * Method to check if the queue is empty.
 * @return true if the queue is empty, false otherwise.
 */
    public boolean isEmpty() {
        if (list.size == 0) {
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
        if (isEmpty()) {
            return null;
        }
        //need to implement the else part.
        return null;
    }

/**
 * Method to add an element to the end of the queue.
 * @param E the element to add to the end of the queue.
 */
    public void enqueue(E node) {
        list.addLast(node);
    }

/**
 * Method to remove an element from the queue.
 * @param E the element to remove from the queue. 
 */
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        else {
            return list.removeFirst();
        }
    }
}