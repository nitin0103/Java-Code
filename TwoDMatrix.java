import java.util.*;
public class TwoDMatrix {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter size: ");
       int row = sc.nextInt();
       int col = sc.nextInt();

        int arr[][] = new int[row][col];
        System.out.println("enter elements: ");
        for(int i=0; i<row; i++){

            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<row; i++){

            for(int j=0; j<col; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }if(min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
            
         }
         
         System.out.println("Maximum ele : "+max);
         System.out.println("Minimum element : "+min);
        
         sc.close();
        }
}