import java.util.*;
public class CountDigit {

    public void evenNo(int n){
        int originalNo = n;
        int count = 0;
        
        while(n>0){
            int a = n%10;
            n = n/10;
            if(a != 0 && originalNo % a ==0){ 
                count++;
            }
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CountDigit obj = new CountDigit();
        obj.evenNo(n);
    }

    
}
