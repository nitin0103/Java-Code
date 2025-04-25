import java.util.Arrays;
import java.util.Collections;
public class InbuiltArray {
    
    public static void main(String[] args) {
        
        Integer arr[] = {4,2,3,5,1,6};   

    //    Arrays.sort(arr,0,3);

       Arrays.sort(arr, Collections.reverseOrder());  //reverseOrder() function is work on objects and int is primitive data type
       
    //    Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
       }
    }
}
