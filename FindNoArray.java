public class FindNoArray {

    public static int findArr(int arr[]){
        int target = 4;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
         }
         return -1;

    }
    
    public static void main(String[] args){

        int arr[] = {3,2,5,6,7,4};
        System.out.println(findArr(arr));
    }
}
