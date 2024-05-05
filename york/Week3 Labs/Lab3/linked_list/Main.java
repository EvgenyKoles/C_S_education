class Node {

    int key;
    Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    public void add(int key) {
        Node newNode = new Node(key);
        newNode.next = head; // move the first node
        head = newNode; //  head is a new node now
    }

    // Method to search for a node with a given key
    public Node listSearch(int k) {
        Node x = head;
        while (x != null && x.key != k) {
            x = x.next;
        }
        return x;
    }

     public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.key + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);

        // Searching for a key
        int searchKey = 20;
        Node foundNode = list.listSearch(searchKey);

        if (foundNode != null) {
            System.out.println("Node with key " + searchKey + " found.");
        } else {
            System.out.println("Node with key " + searchKey + " not found.");
        }
        list.printList();
       
    }
}
