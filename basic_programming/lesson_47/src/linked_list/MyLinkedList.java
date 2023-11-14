package linked_list;

public class MyLinkedList<T> implements MyList<T> {

    private int size;
    private Node<T> first;

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            first = newNode;
        } else {
            Node<T> current = first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Некорректный индекс!");
            return null;
        }
        if (isEmpty()) {
            return null;
        }
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
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
    public void set(int index, T element) {

    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Node<T> current = first;
        while (current != null) {
            builder.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}