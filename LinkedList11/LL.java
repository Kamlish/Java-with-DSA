package JavaWithDSA.LinkedList11;
import java.util.*;

public class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    // to store data
    class Node{
        String data;
        Node next;  // Agle wala data

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first
    public void addFirst(String data){
        Node newNoode = new Node(data);
        if (head == null){
            head = newNoode;
            return;
        }
        newNoode.next = head;
        head = newNoode;
    }
    // add - Last
    public void addLast(String data){
        Node newNoode = new Node(data);
        if (head == null){
            head = newNoode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNoode;
    }

    // addInMiddle
    public void addInMiddle(int index, String data) {
        if(index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }
        size++;

        Node newNode = new Node(data);
        if(head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for(int i=1; i<size; i++) {
            if(i == index) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }

    // Print
    public void printList(){
        if(head == null) {
            System.out.println("list is empaty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // delete first - head ke next of head bana lain
    public void deleteFirst() {
        // corner case means agar head null hua
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        // agar single node hai
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next; // head.next = null -> lastNode = null
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }



    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();


        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

        list.addInMiddle(1,"hi");
        System.out.println(list);

    }
}
