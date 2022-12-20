/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый
элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
(Подобную задачу решали на семинаре. Здесь так же нужно создать класс,
который будет реализовывать указанные методы)
 */

public class Main_2 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.enqueue(1);
        myClass.enqueue(2);
        myClass.enqueue(3);
        System.out.println(myClass.getList());
        System.out.println(myClass.first());
        System.out.println(myClass.getList());
        System.out.println(myClass.dequeue());
        System.out.println(myClass.getList());
    }
}