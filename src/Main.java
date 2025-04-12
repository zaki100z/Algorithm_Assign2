public class Main {
    public static void main(String[] args) {
        System.out.println("MyArrayList Test");
        MyList<String> arrayList = new MyArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("Get index 1: " + arrayList.get(1));
        arrayList.remove(1);
        System.out.println("After remove: " + arrayList.get(1));

        System.out.println("\nMyLinkedList Test ");
        MyList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("LinkedList size: " + linkedList.size());
        linkedList.remove(0);
        System.out.println("First element after remove: " + linkedList.get(0));

        System.out.println("\nMyStack Test");
        MyStack<String> stack = new MyStack<>();
        stack.push("One");
        stack.push("Two");
        System.out.println("Top: " + stack.peek());
        System.out.println("Pop: " + stack.pop());

        System.out.println("\nMyQueue Test ");
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(100);
        queue.enqueue(200);
        System.out.println("Front: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());

        System.out.println("\nMyMinHeap Test ");
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(5);
        heap.insert(3);
        heap.insert(7);
        System.out.println("Min: " + heap.peek());
        System.out.println("Extract Min: " + heap.extractMin());
    }
}
