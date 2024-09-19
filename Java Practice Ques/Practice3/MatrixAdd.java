package Practice3;

public class MatrixAdd {
    int[][] MatAdd(int[][] arr1, int[][] arr2) {
        int[][] sumarr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumarr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sumarr;
    }
}