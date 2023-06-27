import java.util.HashSet;

public class union {
    public static void main(String args[])
    {
    int [] arr1={ 2,3,2,1,4};
    int n1 = arr1.length;
    int [] arr2 = {5 ,2 ,8 ,9 ,0,3};
     int n2 = arr2.length;
    HashSet<Integer> set = new HashSet<>( );

    for(int i = 0 ; i<n1 ;i++)
    {
        set.add(arr1[i]);
    }

    for(int j =0 ; j<n2 ; j++)
    {
        set.add(arr2[j]);
    }
    
    
    System.out.println(set);
    
    System.out.println(set.size()-1);
}
}
