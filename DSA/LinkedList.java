public class LinkedList {
 Node head;
 private int size;

 LinkedList()
 {
    this.size = 0;
 }
    class Node{
        
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add-first
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //add-last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //print 
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

       System.out.println("Null");

    }

    //delete first 
    public void deleteFirst(){
        if(head == null){
            System.out.println("This is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last 
    public void deleteLast(){
        if(head == null){
            System.out.println("This is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize()
    {
        return size;
    }


 public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        //delete first
        list.deleteFirst();
        list.printList();

        //delete last
        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
 }
    
}
