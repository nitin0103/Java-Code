public class SelectionSort {
    
    public static void main(String[] args) {
        int arr[] = {4,2,1,5,3};

        for(int i=0; i<arr.length-1; i++){
            int MinEle = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[MinEle]){
                    MinEle = j;
                }
            }
            int temp = arr[MinEle];
            arr[MinEle] = arr[i]; 
            arr[i] = temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
