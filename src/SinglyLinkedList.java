// SinglyLinkedList.java

/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 */
public class SinglyLinkedList {

    // -------------------------------------------------------
    // Instance variable

    private Node head;

    // -------------------------------------------------------
    // Constructor

    public SinglyLinkedList() {
        head = null;
    }

    // -------------------------------------------------------
    // Add a node to the end of the list

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // -------------------------------------------------------
    // Display the linked list

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // -------------------------------------------------------
    // Find the middle node

    public Node findMiddle() {
        // Using the slow and fast pointer technique
        Node slow = head;
        Node fast = head;

        // Fast pointer moves twice as fast as the slow pointer.
        // When fast reaches the end, slow will be at the middle.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // -------------------------------------------------------
    // Get the head
    public Node getHead() {
        return head;
    }
}