package Day_07.array.arrayProblems;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {0,0,3},
            {0,0,0},
            {4,0,0}
        };
        int rows = matrix.length;
        int cols = matrix[0].length; // only for the square matrix
        int zeroCount = 0;
        int nonzeroCount = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j]==0){
                    zeroCount++;
                }else{
                    nonzeroCount++;
                }
            }
        }
        System.out.println("Zeros: "+zeroCount);
        System.out.println("Non-Zeros: "+nonzeroCount);
        // System.out.println(zeroCount > (rows*cols)/2 ? "Sparse" : "Not Sparse");
        System.out.println(zeroCount > nonzeroCount ? "Sparse" : "Not Sparse");
    }
}
