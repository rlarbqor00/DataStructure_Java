//연습
package LinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList numbers = new DoublyLinkedList();

        // numbers.addFirst(30);
        // numbers.addFirst(20);
        // numbers.addFirst(10);

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
        numbers.addLast(50);
        numbers.addLast(60);
        numbers.addLast(70);
        numbers.addLast(80);

        System.out.println(numbers);

        // numbers.add(1, 1);
        // numbers.add(6, 6);

        // numbers.add(5, 15);
        // System.out.println(numbers.removeFirst());
        // System.out.println(numbers.remove(4));
        // System.out.println(numbers.removeLast());
        // System.out.println(numbers.size());
        // System.out.println(numbers.get(4));
        // System.out.println(numbers.indexOf(50));

        DoublyLinkedList.ListIterator i = numbers.listIterator();

        // while (i.hasNext()) {
        // System.out.println(i.next());

        // }
        // i.add(5);
        // i.next();
        // i.add(15);

        while (i.hasNext()) {
            System.out.println(i.next());

        }
        while (i.hasPrevious()) {
            System.out.println(i.previous());

        }

        System.out.println(numbers);

    }

}
