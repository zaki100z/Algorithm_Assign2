public class MyQueue<E> {
    private MyLinkedList<E> list;

    public MyQueue() {
        list = new MyLinkedList<>();
    }

    public void enqueue(E element) {
        list.add(element); // Add at tail
    }

    public E dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return list.remove(0); // Remove from head
    }

    public E peek() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
