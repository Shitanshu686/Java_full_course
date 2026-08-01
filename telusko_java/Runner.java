//These all codes are written by Shitanshu Jha himself not ai
public class Runner {
    public static void main(String[] args) {
        Linked_list list = new Linked_list();
        list.insert(5);
        list.insert(27);
        list.insert(3);
        list.insert(4);
        list.insertAtStart(9);
        list.show();
        // System.out.println();
        list.delete();
        list.show();

        System.out.println("Total Elements " + list.count());
    }
}
