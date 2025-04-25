public class PrefixSum {
    
    public static void main(String[] args) {
        int maxsum = Integer.MIN_VALUE;
        int curSum = 0;
        int arr[] = {10,20,30,40,50};
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                curSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(maxsum < curSum){
                    maxsum = curSum;
                }
            }
        }
        System.out.println(maxsum);
    }
}
