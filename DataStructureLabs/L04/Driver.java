import java.util.HashSet;
import java.util.Set;

public class Driver  
{ 
    public static boolean contains_duplicates(int arr[])
    { 
        for (int i = 0; i< arr.length; i++) // O(n)
        {
            for (int j = 0; j < arr.length; j++) // O(n)
            {
                if (arr[i] == arr[j] && i != j)  // this results in O(n^2)
                // also checks if i and j are the same or not.
                {
                    return true; // returns true if a duplicate is found
                }
            }
        }
        return false; // if nothing matches it will return false;
    }

    public static boolean contains_duplicates_better(int arr[])
    {
        Set<Integer> list = new HashSet<Integer>();
        for (int i : arr) // O(n)
        {
          if (list.contains(i)) // this bascially checks if the hashset contains anything matching
          {
            return true; // it does it turns true
            // O(n)
          } 
          list.add(i); // this adds the next number into the has set if nothing matches.
        }
        return false; // if nothing matches it will return false;
    }
        

    public static void main(String[] args)  
    { 
        int arr[] = new int[]{1, 2, 7, 3, 4, 6, 8}; 
        System.out.println(contains_duplicates(arr)); 
        System.out.println(contains_duplicates_better(arr)); 
    } 
} 