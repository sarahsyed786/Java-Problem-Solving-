//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

import java.util.List;
import java.util.Scanner;

public class LL {
    Node head;

    class Node{

        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    //add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;

    }

    //print
    public void printList(){
        if(head==null){
            System.out.println("This is empty");
            return;
            
        }

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number you want to search: ");
        int num = sc.nextInt();
        
        Node curNode = head;
        while(curNode!=null){
            if(curNode.data==num){
            System.out.println("This is your number: " + curNode.data);
        }
            curNode = curNode.next;
        }
        System.out.println("Null");

    }
    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(7);
        list.addFirst(3);
        list.addFirst(8);
        list.addFirst(2);

        list.printList();
        
    }
    
}
