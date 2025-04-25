public class SubArrayAdd {
    public static void main(String[] args){

        int max = Integer.MIN_VALUE;
        int curSum = 0;

        int arr[] = {10,20,30,40,50};
        for(int i=0; i<arr.length; i++){
    
            for(int j=i; j<arr.length; j++){
                curSum = 0;
                for(int k=i; k<=j; k++){
                    
                    curSum = curSum + arr[k];
                }
                System.out.print(curSum+" ");

                if(max < curSum){
                    max = curSum;
                }
            }
        }
        System.out.println();
        System.out.println("Maximum sum is: "+max);
    }
}
