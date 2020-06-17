/**
 * Class which implements a stack using the array data structure.
 * @param <E> the type of element.
 */
public class ArrayStack<E> implements Stack<E> {
    private E[] list;
    public static final int maxCapacity = 10;
    private int top = 0;
    private int size = 0;
    
/**
 * constructor to create an empty array stack.
 */
    public ArrayStack() {
        list = (E[]) new Object[maxCapacity];
    } 

/**
 * Method to return the size of the stack.
 * @return the size of the stack.
 */
    public int size() {
        return size;
    }

/**
 * Method to check if the stack is empty.
 * @return true if the stack is empty, false otherwise.
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
 * Method to add an element to the stack.
 * @param E the element to add to the stack.
 */
    public void push(E e) throws IllegalStateException {
        if (size == maxCapacity) {
            throw new IllegalStateException("Stack is full!");
        }
        else {
            list[top] = e;
            top++;
            size++;
        }
    }    

/**
 * Method to remove an element from the stack.
 * @return the element removed from the stack.
 */
    public E pop() {
        if (size == 0) {
            return null;
        }
        else {
            top--;
            E e = list[top];
            size--;
            return e;
        }
    }

/**
 * Method to get the element at the top of the stack.
 * @return the element at the top of the stack.
 */
    public E top() {
        return list[top - 1];
    }
}