import java.util.Arrays;

public class Driver { 
 
    /* 
    public static void selectionSort(ArrayList<Integer[]> tuples) 
    { 
        // Fill in this method (optional)  
    } */
 
    public static String[] sortTeams(String[] teams, int[] points)  
    { 
        // Fill in this method 
        // sets the length of the pointer
        int n = points.length;

        for (int i = 0; i < n-1; i++)
        {
            // Find the maximum element in unsorted array
            int max_idx = i;
            for (int j = i+1; j < n; j++)
                if (points[j] > points[max_idx]) // if points[j] > greater than points[max_index] 
                    max_idx = j;// it sets it to the new max index
 
            // this basically sets swaps the max points with the first points if it's lower
            int temp = points[max_idx];
            points[max_idx] = points[i];
            points[i] = temp;
            // then this does the same with the names
            String temp2 = teams[max_idx];
            teams[max_idx] = teams[i];
            teams[i] = temp2;
        }
        // returns a sorted array
        return teams;  
    } 
    public static void main(String[] args)  
    { 
        String[] teams = new String[]{"Italy","Argentia", "England", "Brazil", "Belgium", 
"France", "Spain"}; 
        int[] points = new int[] {1726, 1773, 1728, 1841, 1816, 1759, 1715}; 
 
        System.out.println("\nOriginal Teams Array"); 
        System.out.println("********************"); 
        System.out.println(Arrays.toString(teams)); 
 
        System.out.println("\nOriginal Points Array"); 
        System.out.println("********************"); 
        System.out.println(Arrays.toString(points)); 
 
        System.out.println("\nTeams Sorted by their points"); 
        System.out.println("*******************************"); 
        System.out.println(Arrays.toString(sortTeams(teams, points))); 
         
    } 
} 