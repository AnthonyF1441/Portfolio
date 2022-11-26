import java.util.ArrayList;

public class Driver { 
    public static void main(String[] args) { 
        LinkedList list = new LinkedList(); 
        list.insertElement(new People("Steve Jobs", 55, "Not Vaccinated")); 
        list.insertElement(new People("Bill Gates", 65, "Vaccinated")); 
        list.insertElement(new People("Angelina Jolie", 50, "Not Vaccinated")); 
        list.insertElement(new People("Warren Buffet", 75, "Not Vaccinated")); 
        list.insertElement(new People("Tim David", 35, "Vaccinated")); 
        list.insertElement(new People("Lizzy Stone", 25, "Vaccinated")); 
        list.insertElement(new People("Eva Jobs", 55, "Not Vaccinated")); 
        list.insertElement(new People("Melinda Gates", 55, "Vaccinated")); 
        list.insertElement(new People("Elon Musk", 53, "Not Vaccinated")); 
 
        System.out.println("\nOriginal List"); 
        System.out.println("*********************"); 
        // Fill in missing line of code 
        ArrayList<LinkedList> list1 = list.split(list); // makes a object to store vaccinated and unvacced ppl
        list.print();

        System.out.println("\nVaccinated People"); 
        System.out.println("*********************"); 
        // Fill in missing line of code 
        list1.get(0).print();

        System.out.println("\nUnvaccinated People"); 
        System.out.println("*********************"); 
        // Fill in missing line of code 
        list1.get(1).print();
 
    } 
} 