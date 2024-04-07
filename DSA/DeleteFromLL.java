//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

public class DeleteFromLL {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

        //add-last
        public void addFirst(int data){

            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }
            
            Node curNode = head;
            while(curNode.next!=null){
                curNode = curNode.next;
            }
            curNode.next = newNode;

        }


        //print
        public void printList(){
            if(head==null){
                System.out.println("This is empty!");
                return;
            }

            Node curNode = head;
            while (curNode!=null) {
                System.out.print(curNode.data + "->");
                curNode = curNode.next;
            }
            System.out.println("null");
        }
    

    //delete
    public void deleteLast(){
        if(head == null){
            System.out.println("This is empty");
            return;
        }
       
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;

        while(lastNode.next!=null){
            
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
            
        }
        secondLastNode.next = null; 
    
    }

    public static void main(String[] args) {
        DeleteFromLL list = new DeleteFromLL();
        
        for(int i = 1; i<51; i++){
            list.addFirst(i);
            
        }
        list.printList();

        for(int i = 1; i<26; i++){
        list.deleteLast();
        }
        list.printList();

        
    }
    
}
