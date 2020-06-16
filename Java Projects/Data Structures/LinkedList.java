public class LinkedList<E> {
    private static class Node<E> {
        E element;
        private Node<E> next = null;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    public Node<E> head;
    public Node<E> tail;
    public int size;
    
}
