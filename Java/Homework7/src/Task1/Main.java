package Task1;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.print();
        queue.delete();
        System.out.println();
        System.out.println(queue.getElement());
    }
}
