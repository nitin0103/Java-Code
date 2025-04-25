public class Sorting {

    public static void BubbleSort(int arr[]){

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr.length-1; j++){
                
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
    }

    public static void SelectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int MinEle = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[MinEle] < arr[j]){
                    MinEle = j;
                }
            }
            int temp = arr[MinEle];
            arr[MinEle] = arr[i];
            arr[i] = temp;

        }
    }

    public static void InsertionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int currEle = arr[i];
            int prev = i-1;
            
            while (prev >= 0 &&arr[prev] < currEle ) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = currEle;
        }
    }

    public static void Print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // BubbleSort(arr);
        // SelectionSort(arr);
        InsertionSort(arr);
        Print(arr);

    }
}
