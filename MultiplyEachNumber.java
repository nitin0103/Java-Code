import java.util.*;

class MultiplyEachNumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int num = sc.nextInt();
        // int len = String.valueOf(num).length();
        int ans=1;
        int num2 = num;
        while(num!=0){

            num2 = num % 10;
            ans = ans * num2;
            num = num/10;
    
        }
        System.out.println(ans);
        
    }
}