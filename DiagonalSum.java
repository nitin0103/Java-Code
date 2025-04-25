public class DiagonalSum {
    
    public static void main(String[] args) {
        
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int sum = 0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){          //timeComplexity O(n^2)
        //         //Primary diagonal
        //         if(i == j){
        //             sum = sum + matrix[i][j];
        //         }else if(i + j == matrix.length-1){
        //             //Secondary diagonal
        //             sum = sum + matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println(sum);

        for(int i=0; i<matrix.length; i++){
            //pd
            sum = sum + matrix[i][i];

            //sd
            if(i != matrix.length-i-1)                  // for odd matrix middle element do not add two times
                sum = sum + matrix[i][matrix.length-i-1];           //i + j = n-1
                                                                // j = n-1-i 
        }
        System.out.println(sum);
    }
}
