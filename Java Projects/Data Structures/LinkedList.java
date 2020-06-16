public class LinkedList<E> {
    private static class Node<E> {
        E element;
        private Node<E> next = null;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getNextElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
/**
 * constructor for creating a singlylinkedlist.
 */
    public SinglyLinkedList() {

    }

/**
 * 
 * @return the size of the linkedlist.
 */
    public int size() {

    }

    /**
     * 
     * @return true if the linkedlist is empty, false otherwise.
     */

    public boolean isEmpty() {

    }

    public E first() {

    }

    public E list() {

    }

    public void addFisrt(E element) {

    }

    public void addLast(E element) {

    }

    public E removeFirst() {

    }

}