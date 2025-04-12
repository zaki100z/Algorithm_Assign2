import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {
    private Object[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyArrayList() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public void add(E element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E removedElement = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
        return removedElement;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    private void resize() {
        int newCapacity = elements.length * 2;
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int current = 0;

            @Override
            public boolean hasNext() {
                return current < size;
            }

            @Override
            public E next() {
                return (E) elements[current++];
            }
        };
    }

    public void set(int index, E element) {
        checkIndex(index);
        elements[index] = element;
    }

}
