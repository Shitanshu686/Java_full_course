public class Stack_Runner {
    public static void main(String[] args) {
        Stack nums = new Stack();

        // System.out.println("Empty = " + nums.isEmpty());
        // nums.push(15);
        // nums.push(18);
        // nums.push(10);
        // nums.push(12);
        // nums.push(29);

        // nums.push(21);
        nums.pop();
        // System.out.println("The popped element is= " + nums.pop());
        // System.out.println("The top element is= " + nums.peek());
        System.out.println("The size of stack= " + nums.size());
        // System.out.println("Empty = " + nums.isEmpty());
        nums.show();
        // nums.push(88);
        // nums.show();
    }
}
