public class KadensAlgo {
    
    public static void main(String[] args) {
        
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};

        int maxSum = Integer.MIN_VALUE; //we can give 0 value 
        int currSum = 0;

        for(int i=0; i<arr.length; i++){
            currSum = currSum + arr[i];

            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);  //max function gives the value which is greater than out of two value
        }
        System.out.println(maxSum);
    }
}
