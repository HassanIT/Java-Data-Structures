/**
 * Class which represents the linkedlist data structure, implemented in java.
 */

public class LinkedList<E> {
    public Node<E> head; //pointer to the first element in the list.
    public Node<E> tail; //pointer to the last element in the list.
    public int size; //variable to store the size of the list.

/**
 * Method to check the current size of the list.
 * @return the current size of the list.
 */
    public int size() {
        return size;
    }
    
/**
 * Method to check if the list is empty.
 * @return true if the list is empty, false otherwise.
 */
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

/**
 * Class which represents the head, tail, and element nodes in the list.
 * @param <E> the element type.
 */
    public static class Node<E> {
        E element;
        private Node<E> next = null;

/**
 * Method which sets the node.
 * @param e the element itself.
 * @param n the reference to the next element.
 */
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

/**
 * Method to get the current element.
 * @return the current element.
 */
        public E getElement() {
            return element;
        }

/**
 * Method to get the reference of the next element in the list.
 * @return the reference to the next element in the list.
 */
        public Node<E> getNext() {
            return next;
        }

/**
 * Method to set the reference to the next element in the list.
 * @param n the reference to set to the next element in the list.
 */
        public void setNext(Node<E> n) {
            next = n;
        }
    }   
}
