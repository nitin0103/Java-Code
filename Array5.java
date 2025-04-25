import java.util.Scanner;

public class Array5 {

    public static int linearSearch(String arr[], String target){
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu[] = {"dosa", "chhole bhature", "samosa", "kachori"};
        String target = sc.next().toLowerCase();
        
        int index = linearSearch(menu, target);
        if(index == -1){
            System.out.println("String not found");
        }else{
            System.out.println("String index found at index: "+index);
        }
        sc.close();
    }
}
