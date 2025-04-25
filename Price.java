public class Price {
    
    public static void main(String[] args) {
        
        int arr[] = {7,1,5,3,6,4};

        int BuyPrice = Integer.MAX_VALUE;
        int Maxprofit = 0;

        for(int i=0; i<arr.length; i++){
            if(BuyPrice < arr[i]){
                int profit = arr[i] - BuyPrice;
                Maxprofit = Math.max(profit, Maxprofit);
            }
            else{
                BuyPrice = arr[i];
            }
        }
        System.out.println(BuyPrice);
        System.out.println(Maxprofit);
    }
}
