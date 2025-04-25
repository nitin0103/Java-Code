import java.util.ArrayList;
import java.util.Collections;
// import java.util.HashSet;

public class Triplet {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++ ){

                for(int k=j+1; k<arr.length;k++){

                    if(arr[i] + arr[j] + arr[k] == 0){
                         ArrayList < Integer > obj = new ArrayList <Integer>();
                        obj.add(arr[i]);
                        obj.add(arr[j]);
                        obj.add(arr[k]);

                        Collections.sort(obj);
                        System.out.println(obj);
                    }
                }
            }
        }
    }
    
}