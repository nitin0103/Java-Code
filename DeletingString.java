import java.util.*;
class DeletingString{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        String C= "";

        for(int i=0; i<A.length(); i++){

            int flag = 0;

            for(int j=0; j<B.length(); j++){
 
                if(A.charAt(i) == B.charAt(j)){
                    flag = 1;

                }

            }
            if(flag == 0){
                C = C + A.charAt(i);
            }
            
        }
        System.out.println(C);
    }

}