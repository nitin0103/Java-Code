public class CountingSort {
    
    public static void main(String[] args) {
        
        int arr[] = {3,4,2,4,5,7,5};
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //SORTING
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
