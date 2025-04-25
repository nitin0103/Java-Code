public class RainTrapping {
    
    public static void main(String[] args) {
        
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        // int height[] = {4,2,0,3,2,5};

        int leftMaxHeight[] = new int[height.length];
        int rightMaxHeight[] = new int[height.length];

        leftMaxHeight[0] = height[0];
        rightMaxHeight[height.length-1] = height[height.length-1];

        for(int i=1; i<height.length; i++){
            leftMaxHeight[i] = Math.max(height[i], leftMaxHeight[i-1]);
        }

        for(int i=height.length-2; i>=0; i--){
            rightMaxHeight[i] = Math.max(height[i], rightMaxHeight[i+1]);
        }

        int trappedWater = 0;
        for(int i=0; i<height.length;i++){
            int waterlevel = Math.min(leftMaxHeight[i], rightMaxHeight[i]);
            trappedWater = trappedWater + waterlevel - height[i];
        }
        System.out.println(trappedWater);
    }
}
