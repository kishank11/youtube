
public class MinMaxStackDemo {
    public static void main(String[] args) {
        MinMaxStack stack = new MinMaxStack();
        stack.push(5);
        stack.push(2);
        stack.push(7);

        System.out.print("Min:" + stack.getMin());
        System.out.print("Max:" + stack.getMax());

        stack.pop();

        System.out.print("Min after pop:" + stack.getMin());
        System.out.print("Max after pop:" + stack.getMin());

    }
}
