public class SmallEle {

    public static int getSmall(int arr[]){
        int small = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(small >  arr[i]){
                small = arr[i];
            }
        }
        return small;
    }
    
    public static void main(String[] args) {
        
        int arr[] = {20,30,43,4,5,1};

        System.out.println(getSmall(arr));

    }
}
