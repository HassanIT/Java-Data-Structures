/**
 * Class which represents the singlylinkedlist data structure, implemented in java. Extends the base or parent class LinkedList.
 */
public class SinglyLinkedList<E> extends LinkedList<E> {

 /**
  * Default constructor which creates an empty singlylinkedlist.
  */
    public SinglyLinkedList() {
    head = null;
    tail = null;
    size = 0;
    }

/**
 * Method to see if a 'head' element exists.
 * @return the first element present in the singlylinkedlist, null otherwise.
 */
    public E first() {
        if (head != null) {
            return head.getElement();
        }
        else {
            return null;
        }
    }

/**
 * Method to see if a 'tail' element exists.
 * @return the last element present in the singlylinkedlist, null otherwise.
 */
    public E last() {
        if (tail != null) {
            return tail.getElement();
        }
        else {
            return null;
        }
    }

/**
 * Method to add an element to the beginning of the singlylinkedlist.
 * @param element to add to the beginning of the singlylinkedlist.
 */
    public void addFisrt(E element) {
        head = new Node<E>(element, head);
        if (isEmpty()) {
            tail = head;
        }
        size++;
    }

/**
 * Method to add an element to the end of the singlylinkedlist.
 * @param element to add to the end of the singlylinkedlist.
 */
    public void addLast(E element) {
        tail = new Node<E>(element, tail);
        if (isEmpty()) {
            head = tail;
        }
        size++;
    }

/**
 * Method to remove the first element of the singlylinkedlist.
 * @return the element removed from the beginning of the singlylinkedlist.
 */
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E element = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return element;
        }
    }
