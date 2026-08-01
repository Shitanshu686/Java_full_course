
public class Linked_list {
    Node head;

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
            return;
        }

        node.next = head;
        head = node;
    }

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
            return;
        }
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = node;
    }

    public void show() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node n = head;
        while (n.next != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.print(n.data);

    }

    public int count() {
        int count = 0;
        Node temp = head;
        if (head == null) {
            System.out.println("Empty");
            return 0;
        } else {
            while (temp.next != null) {
                count++;
                temp = temp.next;
            }
            count++;
            return count;
        }
    }

    public void insertAt(int index, int value) {

        Node node = new Node();
        node.data = value;
        node.next = null;
        Node temp;

        temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;

        }

        node.next = temp.next;
        temp.next = node;
    }

    public void deleteAtStart() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        head = head.next;
    }

    public void deleteAt(int index) {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (index == 0) {
            deleteAtStart();
            return;
        }
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    void delete() {

        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = head;
        if (head.next == null) {
            deleteAtStart();
        } else {
            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
        }
    }

}
