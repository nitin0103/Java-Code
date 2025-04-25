public class KadensAlgo2 {
    
    public static void main(String[] args) {
        
        int arr[] = {-6,-1,-2,-3,-4,-5};

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int count = 0;
        int arrMin = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            if(arr[i] < 0){
                count++;
            }
            if(arrMin < arr[i]){
                arrMin = arr[i];
            }
            if(count == arr.length){
                System.out.println(arrMin);
                return;
            }
        }

        for(int i=0; i<arr.length; i++){

            currSum = currSum + arr[i];

            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }
}
