public class SelectionSort2 {
    
    public static void main(String[] args) {

        int arr[] = {4,3,6,1,2};
        
        for(int i=0; i<arr.length-1; i++){

            int MinEle = i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[MinEle] > arr[j]){
                    MinEle = j;
                }
            }
            int temp = arr[MinEle];
            arr[MinEle] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
