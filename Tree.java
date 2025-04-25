import java.util.*;

class Tree{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int interest = sc.nextInt();
        int tree = sc.nextInt();
        int amount = sc.nextInt();

        while(tree > 1){
            amount = amount * interest/100 ;
            tree--;
        }
       
        System.out.println(amount);

    }
}