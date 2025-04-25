class BinarySearch{
    public static void main(String[] args) {
        
        int arr[] = {10,20,30,40,50};

        int start = 0; 
        int end = arr.length-1;
        int target = 50;

        for(int i=start; i<=end; i++){
            int mid = (start + end) / 2;

            if(arr[mid] == target){
                System.out.println("index found at index: "+mid);
                return;

            }else if(arr[mid] < target){  //right
                start = mid+1;

            }else{     //left
                end = mid-1;
            }
        }
        System.out.println("Target not found in the array");
    }
}