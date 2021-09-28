package Task2;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.print();

        stack.add(4);
        stack.print();

        stack.delete();
        stack.delete();
        stack.print();
    }
}
