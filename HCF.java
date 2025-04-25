import java.util.*;

class HCF{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        List<Integer> li = new ArrayList<Integer>();
        int hcf = Math.min(num1, num2);

        int a = 1;
        for(int i=1; i<hcf; i++){
            if(num1 % a == 0 && num2 % a == 0){
                li.add(a);
            }
            a++;
        }
        System.out.println(li);
        System.out.println(li.get(li.size() - 1));
    }
}