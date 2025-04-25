public class Array3 {

    public static void update(int arr1[]){

        for(int i=0; i<arr1.length; i++){
            arr1[i] = arr1[i] + 1;
        }
    }
    
    public static void main(String[] args) {
        
        int arr[] = {10,30,40};
        update(arr);      //call by reference

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
