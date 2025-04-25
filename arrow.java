public class arrow {
    
    public static void main(String[] args) {
        
        int row = 5;

        for(int i=0; i<row; i++){
            if(i==4){
                for(int j=0; j<2*row; j++){
                    System.out.print("*");
                }
            }else{
                for(int j=0; j<=2*row; j++){
                    System.out.print(" ");
                }
            }
            
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        for(int i=row-1; i>0; i--){
            for(int j=0; j<=2*row; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
