public class Stack {
    int stack[] = new int[5];
    int top = 0;

    public void push(int data) {
        if (isFull()) {
            System.out.println("The stack is full");
            return;
        }
        stack[top] = data;
        top++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is already empty");
            return 0;
        } else {
            int data;
            top--;
            data = stack[top];
            stack[top] = 0;
            return data;
        }
    }

    public int peek() {
        top--;
        int data = stack[top];
        return data;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public boolean isFull() {
        return top == 5;
    }

    public void show() {
        for (int n : stack) {
            System.out.print(n + " ");
        }
    }
}
