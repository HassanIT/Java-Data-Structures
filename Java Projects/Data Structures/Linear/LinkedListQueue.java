/**
 * Class which represents the queue data structure in java.
 */
public class LinkedListQueue<E> implements Queue<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<E>();
    
    public LinkedListQueue() {
        list.head = null;
        list.tail = null;
        list.size = 0;
    }

    public int size() {
        return list.size;
    }

    public boolean isEmpty() {
        if (list.size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public E first() {
        return list.tail;
    }

    public void enqueue(E node) {
        list.addLast(node);
    }

    public E dequeue() {
        if (list.head == null) {
            list.tail = null;
            return null;
        }
        else {
            return list.removeFirst();
        }
    }
}