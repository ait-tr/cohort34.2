package queue;

import interfaces.MyCollection;

public class Main {

    public static void main(String[] args) {

        MyCollection<String> queue = new MyQueue<>();

        System.out.println("Пустая ли очередь? - " + queue.isEmpty());
        System.out.println("Размер очереди - " + queue.size());
        System.out.println(queue);

        queue.push("AAA");
        queue.push("BBB");
        queue.push("CCC");
        queue.push("DDD");

        System.out.println("Пустая ли очередь? - " + queue.isEmpty());
        System.out.println("Размер очереди - " + queue.size());
        System.out.println(queue);

        String removedElement = queue.pop();
        System.out.println("Удалённый элемент - " + removedElement);
        System.out.println("Размер очереди - " + queue.size());
        System.out.println(queue);

        removedElement = queue.pop();
        System.out.println("Удалённый элемент - " + removedElement);
        System.out.println("Размер очереди - " + queue.size());
        System.out.println(queue);
    }
}