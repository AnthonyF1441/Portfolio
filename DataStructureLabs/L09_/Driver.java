import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack; 
 
class Node 
{ 
    Student student; 
    Node left; 
    Node right; 
 
    Node(Student student) 
    { 
        this.student = student; 
    } 
} 
 
public class Driver { 
 
    static int sum; 
    static int count; 
 
    public static int getAverageAge(Node node)  
    { 
        Queue<Node> q = new LinkedList<Node>();
        // adds the node to the queue
        q.add(node);
        int sum = 0, count  = 0;
        
        while (!q.isEmpty()) 
        {
            sum = 0;
            count = 0;
            // makes a new temp queue
            Queue<Node> temp = new LinkedList<Node>(); 
            while (!q.isEmpty()) 
            { 
                // retrives and removes the head afterwards fro mthe q
                Node n = q.peek();
                q.remove();
                // adds the student age to the sum
                sum += n.student.age;
                // adds to the count
                count++;
                // if the head is != null then add the value to temp
                if (n.left != null)
                    temp.add(n.left);
                if (n.right != null)
                    temp.add(n.right);
            }
            q = temp;
        }
        // returns the avg
        return (sum / count) -1;
    } 
    /* 
    public static int getAverage(Node root) 
    { 
 
       // Fill this function (optional)

    } */
     
    public  static Node getMinimum(Node root) 
    { 
        // Fill this function   
        Node current = root;
 
        // loop down to find the leftmost leaf 
        // it looks for the lowest value in the left side leaf (aka the lowest) once there it returns that value
        while (current.left != null) 
        {
            current = current.left;
        }
        return (current);
    } 
 
    public  static Node getMaximum(Node root) 
    { 
        // Fill this function 
        
        Node current = root;
 
        // loop down to find the rightmost leaf 
        // it looks for the lowest value in the right side leaf (aka the highest) once there it returns that value
        while (current.right != null) 
        {
            current = current.right;
        }
        return (current); 
    } 
 
    public static void printNodes(Node root) 
    { 
        // Fill this function 
        Stack<Node> stack = new Stack<>();

        while (root!=null || !stack.empty())
        {
            if (root!=null)
            {
                stack.push(root);
                root = root.left;
            }
            else
            {
                root = stack.pop();
                System.out.println(root.student.toString());
                root = root.right;
            }
        }
    } 
    public static void main(String[] args) { 
 
        Node root = new Node(new Student("Steve Jobs", 55)); 
        root.left = new Node(new Student("Elon Musk", 45)); 
        root.right = new Node (new Student("Bill Gates", 75)); 
        root.left.left = new Node (new Student("Ben Stokes", 40)); 
        root.left.right = new Node (new Student("Angelina Jolie", 48)); 
        root.right.left = new Node(new Student("Warren Buffet", 72)); 
        root.right.right = new Node(new Student("Lizzy Bank", 80));   
         
        System.out.println("\nList of Students"); 
        System.out.println("***********************"); 
        printNodes(root); 
 
        System.out.println("\nClass Statistics"); 
        System.out.println("***********************"); 
        System.out.println("Youngest Student: " + getMinimum(root).student.toString()); 
        System.out.println("Oldest Student: " + getMaximum(root).student.toString()); 
        System.out.println("Average Age of Students: " + getAverageAge(root)); 
    } 
} 
 