public class EleSearchSorted {
    
    public static void main(String[] args) {
        
        int matrix[][] = {{10,20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 50}};

        int key = 33;
        int row = 0;
        int col = matrix[0].length-1;       //I take first row of last element

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("key found at ("+row +","+col +")");         //time complexity O(n+m) // if row >> col  or col >> row
                return;
            }else if(matrix[row][col] > key){
                col--;
            }else{
                row++;
            }
        }
        System.out.println(key+" not found");
        return;
    }
}
