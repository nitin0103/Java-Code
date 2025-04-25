public class ReverseArray {

    public static void main(String[] args) {
        
        int arr[] = {10,20,30,40,50};

        int start = 0; 
        int temp;
        int end = arr.length-1;
        while(start < end) {
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
