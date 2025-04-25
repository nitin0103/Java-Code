public class demo2 {
    public static void main(String []args){
        String s1 = "1D0C1C1A0B1";
        int a = Integer.parseInt(s1.charAt(0)+"");
        for(int i = 1;i<s1.length();i=i+2){
            if(s1.charAt(i)=='A'){
                a=a& Integer.parseInt(s1.charAt(i+1)+"");
            }
            else if(s1.charAt(i)=='B'){
                a=a|Integer.parseInt(s1.charAt(i+1)+"");
            }
            else if(s1.charAt(i)=='C'){
                a=a^Integer.parseInt(s1.charAt(i+1)+"");
            }
            else{
                System.out.println("Invalid Input");
                return;
            }
        }
        System.out.println(a);
    }
}
