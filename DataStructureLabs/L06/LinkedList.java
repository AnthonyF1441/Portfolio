import java.util.ArrayList;

public class LinkedList {
    Node head; // declare node head

    class Node // make a class for node
    {
        // node variables
        People data;
        Node next;

        Node(People d) // paramartized constructor
        {
            data = d;
            next = null;
        }
    }

    public void insertElement(People  people) // inserts elements
    {
        Node newNode = new Node(people);

        // if there is nothing in the head then make the head = newNode;
        if (head == null)
        {
            head = newNode;
        }

        else{ // if there is something in the head, make node last = head
            Node last = head;
            while(last.next != null) // while last.next != null make last = last.next
            {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void print() // prints the function
    {
        Node current = head;

        while (current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public  ArrayList<LinkedList>  split(LinkedList  list)
    {
        // delcares objects
        LinkedList vaccinated = new LinkedList();
        LinkedList unvaccinated = new LinkedList();
    
        Node current = head; // sets current as the head

        while (current != null) // while loop that goes through the linked list as long as current is != null aka empty
        {
            if (current.data.getStatus().toLowerCase().equals("Vaccinated".toLowerCase())) // checks if the status is vaccinated or not   
            {
                vaccinated.insertElement(current.data); // if vaccinated then insert it into the object
            }  
            else 
            {
                unvaccinated.insertElement(current.data); // if not then insert it into the object
            }
            current = current.next; // makes current the next in line for current
        }
        ArrayList<LinkedList> list2 = new ArrayList<LinkedList>(); // making a new arraylist object because for some reason I can't add to the orginal list
        list2.add(vaccinated); // adds the people to list 2
        list2.add(unvaccinated);
        return list2; // returns the list
    }
}
