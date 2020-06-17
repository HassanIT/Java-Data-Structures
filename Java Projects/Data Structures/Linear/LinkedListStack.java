/**
 * Class which implements a stack using the linkedlist data structure.
 * @param <E> the type of element.
 */
public class LinkedListStack<E> implements Stack<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<E>();
    
/**
 * constructor to create an empty linkedlist stack.
 */
    public LinkedListStack() {
        list.head = null;
        list.tail = null;
        list.size = 0;

    }

/**
 * Method to return the size of the stack.
 * @return the size of the stack.
 */
    public int size() {
        return list.size;
    }

/**
 * Method to check if the stack is empty.
 * @return true if the stack is empty, false otherwise.
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
 * Method to get the element at the top of the stack.
 * @return the element at the top of the stack.
 */
    public E top() {
        return list.first();
    }
    
/**
 * Method to add an element to the stack.
 * @param E the element to add to the stack.
 */
    public void push(E node) {
        list.addFirst(node);
    }

/**
 * Method to remove an element from the stack.
 * @return the element removed from the stack.
 */
    public E pop() {
        return list.removeFirst();
    }
}