public class SpiralMatrix {
    
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20}};
        int StartRow = 0;
        int EndRow = matrix.length-1; 
        int StartCol = 0;
        int EndCol = matrix[0].length-1;

        while(StartRow <= EndRow && StartCol <= EndCol){

            //top
            for(int j=StartCol; j<=EndCol; j++){
                System.out.print(matrix[StartCol][j]+" ");
            }

            //right
            for(int i=StartRow+1; i<=EndRow; i++){
                System.out.print(matrix[i][EndCol]+" ");
            }

            //bottom
            for(int j=EndCol-1; j>=StartCol; j--){
                if(StartRow == EndRow){
                    break;
                }
                System.out.print(matrix[EndRow][j]+" ");
            }

            //left
            for(int i=EndRow-1; i>=StartRow+1; i--){
                if(StartCol == EndCol){
                    break;
                }
                System.out.print(matrix[i][StartCol]+" ");
            }
            StartCol++;
            StartRow++;
            EndCol--;
            EndRow--;
        }
        System.out.println();
       

    }
}
