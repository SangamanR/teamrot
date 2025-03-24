# teamrot
import java.util.*;
class main {

    public static void main(String[] args)
    {
        int arr[] = {1,2,1,3,4,2,3};
        int k = 5;
        
        System.out.print(countDistinct(arr,k));
    }
    public static ArrayList<Integer> countDistinct(int arr[], int k) {
       
        ArrayList<Integer> list = new ArrayList<>();
      
       
        for (int i = 0; i <= arr.length - k; i++) {
          
            
            HashSet<Integer> set = new HashSet<>();
            for(int j = i; j < i + k; j++)
                set.add(arr[j]);
          
            
            list.add(set.size());
        }
        return list;
    
    }
        
    
}
