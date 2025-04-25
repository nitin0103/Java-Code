class Powerof2{
    public static void main(String[] args) {
        
        int num = 32;
        // int a = num;
        // while(a%2 == 0){
        //     a = a/2;
        // }
        // if(a == 1){
        //     System.out.println("yes");
        // }else{
        //     System.out.println("no");
        // }

        if ((num & (num - 1)) == 0 && num != 0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}