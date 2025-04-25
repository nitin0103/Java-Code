public class BubbleSort {
    
    public static void main(String[] args) {
        
        int arr[] = {5,4,1,3,2};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){   //arr.length-1 also give same answer but run extra time 
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
           
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
       
    }
}