import java.util.*;
public class Factorial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int originalNo = n;
        int digit = 1;

        while(originalNo > 0){
            digit = digit * (originalNo%10);

            originalNo = originalNo / 10;
        }
        System.out.println(digit);

    }
}
