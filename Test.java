public class Test {
    public static void main(String[] args) {
        stack_liner stack = new stack_liner(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
        stack.peek();

        stack_linked stack1 = new stack_linked();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.pop();
        stack1.peek();
    }
}
