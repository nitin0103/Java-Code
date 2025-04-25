public class LargeEle {
    public static void main(String[] args) {
        
        int arr[] = {10,20,49,30,40};

        int large = Integer.MIN_VALUE;  //-infinity

        for(int i=0; i<arr.length; i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        System.out.println(large);
    }
}
