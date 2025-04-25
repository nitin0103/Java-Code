public class String1 {
    
    public static void main(String[] args) {
        // StringBuffer str = new StringBuffer("Munde");
        String str = "MUNDE";
        // System.out.println(str.reverse());

        char arr[] = str.toCharArray();

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
        
    }
}
