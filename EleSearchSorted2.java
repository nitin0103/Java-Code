public class EleSearchSorted2 {
    
    public static void main(String[] args) {
        
        int matrix[][] = {{10,20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 50}};
        int key = 31;
        int row = matrix.length-1;              //I take last row of first element
        int col = 0;

        while(row >= 0 && col < matrix.length){
            if(matrix[row][col] == key){
                System.out.println(key+ " found at (" +row +","+col +" )");
                return;
            }else if(matrix[row][col] < key){
                col++;
            }else{
                row--;
            }
        }
        System.out.println(key+"  not found");
        return;
    }
}
