class Node 
{ 
    Country country; 
    Node next; 
     
    Node(Country country) 
    { 
        this.country = country; 
    } 
} 
 
public class Driver { 
 
    public static void displayLinkedList(Node node) {
        // Fill in this function
        while (node != null)
        {
            System.out.println(node.country);
            node = node.next;
        }
    } 
    
    public static Node sortDescending(Node head)  
    { 
        // Fill in this function 
        
        if (head.next == null) { // if this condition is met it will stop the loop
            return head;
        }
        else {
            Node temp = sortDescending(head.next); //basically is the for part of a loop that reverses the linked list
            // this also acts as storage for the head
            
            head.next.next = head; // this basically if this points to a memory value (not null) then points back to itself

            head.next = null; //basically makes the arror / pointer to null

            return temp; // returns the reversed linked list
        }

    } 
 
    public static void main(String[] args) { 
 
        Node head = new Node(new Country("Australia", 25499884)); 
        head.next = new Node(new Country("Canada", 37742154)); 
        head.next.next = new Node(new Country("United States", 338289857)); 
        head.next.next.next = new Node(new Country("India", 1417173173)); 
        head.next.next.next.next = new Node(new Country("China", 1425887337)); 
 
        System.out.println("\nOriginal Linked List:"); 
        System.out.println("*********************"); 
        displayLinkedList(head); 
 
        System.out.println("\nSorted Linked List:"); 
        System.out.println("*********************"); 
        displayLinkedList(sortDescending(head)); 
    } 
}