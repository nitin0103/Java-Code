public class InsertionSort {
    
    public static void main(String[] args) {
        
        int arr[] = {5,4,1,3,2};

        for(int i=1; i<arr.length; i++){ //requred 4 element to insert
            
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct position to insert
            while(prev >= 0 && arr[prev] > curr){ // arr[prev] < curr it gives descending order
                arr[prev+1] = arr[prev];
                prev--; 
            }
            //insertion
            arr[prev+1] = curr;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

//TIME COMPLEXITY O(N^2)