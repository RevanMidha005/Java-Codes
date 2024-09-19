package Practice3;

public class MatrixMult {
    int [][] MatMult(int [][]arr1, int [][]arr2){
        int [][]multarr = new int[3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                for (int k = 0; k < 3; k++){
                    multarr[i][j] += arr1[i][k] * arr2[k][i];
                }
            }
        }
        return multarr;
    }
}