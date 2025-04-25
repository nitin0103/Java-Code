import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int arr[] = {10,20,30,40,50};
        int index = linearSearch(arr, key);
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println("found at index: "+index);
        }
        sc.close();
        
    }
}
