public class Pattern {
    public static void main(String []args){
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<2*i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n;i>=0;i--){
            if(i==5){
                for(int j = 0;j<i;j++){
                    System.out.print("* ");
                }
                for(int j = 0;j<=i;j++){
                    System.out.print("*");
                }
            }else{
                for(int j = 0;j<2*i;j++){
                    System.out.print(" ");
                }
                for(int j = 0;j<=i;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
