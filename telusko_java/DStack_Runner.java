import java.util.Scanner;

public class DStack_Runner {
    public static void main(String[] args) {
        DStack num = new DStack();
        num.push(15);
        num.show();
        num.push(8);
        num.show();
        num.push(10);
        num.show();
        num.push(10);
        num.show();
        num.push(10);
        num.show();

        num.pop();
        num.show();
        num.pop();
        num.show();
        num.pop();
        num.show();
    }
}
