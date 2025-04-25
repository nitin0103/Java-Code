import java.util.Scanner;

class nth_prime_no{

    public static int findPrime(int n){
        int count = 0;
        int num = 1;
        while(count < n){
            num++;
            if(isPrime(num)){
                count++;
            }
        }
        return num;
    }

    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i=2;i*i<= num; i++){
            if(num%i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int primeX = findPrime(x);
        int primeY = findPrime(y);

        System.out.println(primeX);
        System.out.println(primeY);
        
    }
}