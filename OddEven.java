import java.util.*;
public class OddEven {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList li1 = new ArrayList<>();
        ArrayList li2 = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(i%2==0){
                li1.add(i);
            }else{
                li2.add(i);
            }
        }
        System.out.println(li1);
        System.out.println(li2);

    }
}
