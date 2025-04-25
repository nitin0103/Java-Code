public class TrappingRain {

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        
        //Calculate leftMax boundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //Calculate rightMax boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length - 1];
        for(int i=height.length - 2; i>=0; i--){
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }
        // loop
        int trappedWater = 0;
        for(int i=0; i<height.length; i++){
            //waterlevel = min(leftMaxBoundary, rightMaxBoundary)
            int WaterLevel = Math.min(leftMax[i], rightMax[i]);
            //trapped water = waterlevel - height[i]
            trappedWater = trappedWater + WaterLevel - height[i];
        }
        
        System.out.println(trappedWater);

        
        
    }
}
