/**
 * Interface that represents the stack data structure in java.
 * @param <E> the element type.
 */
public interface Stack<E> {
    int size(); //the size of the stack.
    boolean isEmpty(); //check to see if the stack in empty.
    void push(E e); //add an element to the stack.
    E top(); //return the element at the top of the stack.
    E pop(); //return the removed element from the stack.
}