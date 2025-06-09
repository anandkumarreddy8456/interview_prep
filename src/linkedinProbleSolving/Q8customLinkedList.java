package linkedinProbleSolving;

public class Q8customLinkedList {
// Q8. Implement a custom LinkedList in Java.
	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Linked List after insertion:");
        list.display();
        list.delete(20);
        System.out.println("Linked List after deletion:");
        list.display();
	}
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class CustomLinkedList{
	private Node head;
	public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
	 public void delete(int key) {
	   if (head == null) return;
       if (head.data == key) {
           head = head.next;
           return;
       }
       Node temp = head;
       while (temp.next != null && temp.next.data != key) {
           temp = temp.next;
       }
       if (temp.next != null) {
           temp.next = temp.next.next;
       }
   }
	 public void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	  }

}