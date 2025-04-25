import java.util.*;
import java.util.stream.IntStream;

public class ElementSeparate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();  
        }

        int [] b = new int[size];
        for (int i = 0; i < size; i++) {
            b[i] = sc.nextInt();  
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int c[] = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                                 .toArray();

        Set<Integer> s = new HashSet<>();
        for(int num : c){
            s.add(num);
        }
        // for(int num : s){
        //     System.out.println(num);
        // }

        double mid; 
        int n = s.size();

        if(n%2==0){
            mid = (c[n/2-1] + c[n/2])/2;
        }else{
            mid = s.size()/2;
        }
        System.out.println(mid);

    }
} 
