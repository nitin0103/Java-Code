public class demo{
    public static void main(String []args){
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=5;j++){
                if(i*j<10){
                    System.out.print("0");
                }
                
                System.out.print(i*j +" ");
                
            }
            System.out.println();
        }
    }
}