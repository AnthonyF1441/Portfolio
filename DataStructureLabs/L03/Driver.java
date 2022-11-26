public class Driver extends Classic{
    public static void main(String[] args) 
    { 
         
    System.out.println("\nCalling through Classic Object..."); 
    System.out.println("*************************************"); 
    // create an object of Classic class and call Report method. Use the below data: 
    Classic classic2 = new Classic("Fantasia in C", "Alfred Brendel", "Philips", 2, 57.17);
    // this sends variables into the classic function 
    classic2.Report(); // prints report

    
    System.out.println("\nCalling through CD Object..."); 
    System.out.println("*************************************"); 
    Classic classic1 = new Classic(null, "Beatles", "Capitol", 14, 35.5);
    classic1.Report() ;
    

        /*create another object of Classic class and assign it to the reference of the   
        parent class (CD class). Finally, call the Report method using the reference of  
        the parent class. Use the below data:  (null, "Beatles", "Capitol", 14, 35.5) */
    } 
}
