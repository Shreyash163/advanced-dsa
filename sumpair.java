import java.util.Arrays;
import java.util.HashMap;

public class sumpair {
    public static void main(String args[]){
        int [] arr = {2 ,6 ,5 , 8 ,11};
        int target = 14 ;
        int [ ] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer , Integer> map = new HashMap<>();

       
        for(int i =0 ; i<arr.length ; i++)
        {
            int complement =  target - arr[i] ; 
            
            if(map.containsKey(complement))
            {   
                ans[0]= i;
                ans[1] = map.get(complement);
                break;
                
                
            }
           
            map.put( arr[i] , i );

        }

        System.out.println(Arrays.toString(ans));
    }
    
}
