// AVL tree implementation in Java

// Create node
public class Driver
{    
       // Driver code
        public static void main(String[] args) { 
            AVLTree tree = new AVLTree(); 
            // so bascially I could do a insert function in the AVL class but like since I've already done this
            // so it will insert the 
            tree.root = tree.insertion(tree.root, new Logs("Steve", "Create Faculty Table", 2010)); 
            tree.root = tree.insertion(tree.root, new Logs("Bill", "Create Student Table", 2011)); 
            tree.root = tree.insertion(tree.root, new Logs("Elon", "Create Staff Table", 2012)); 
            tree.root = tree.insertion(tree.root, new Logs("John", "Upated Faculty Table", 2013)); 
            tree.root = tree.insertion(tree.root, new Logs("Amen", "Deleted Faculty Table", 2014)); 
            tree.root = tree.insertion(tree.root, new Logs("Juli", "Deleted Faculty Table", 2009)); 
            tree.root = tree.insertion(tree.root, new Logs("Jeff", "Updated Staff Table", 2008)); 
            tree.root = tree.insertion(tree.root, new Logs("Mark", "Deleted Faculty Table", 2015)); 
            tree.root = tree.insertion(tree.root, new Logs("Jack", "Updated Student Table", 2016)); 
     
            System.out.println("\nOriginal Log entries"); 
            System.out.println("***************************************"); 
            tree.preOrder(tree.root); 
     
            tree.deletion(tree.root, 2014); 
            tree.deletion(tree.root, 2009); 
            tree.deletion(tree.root, 2015); 
     
            System.out.println("\n\nLogs after clearing duplicate entries"); 
            System.out.println("***************************************"); 
            tree.preOrder(tree.root); 
        } 
    }
  