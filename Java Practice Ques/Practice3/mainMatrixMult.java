package Practice3;

public class mainMatrixMult {
    public static void main(String[] args) {
        /*
        int [][]arr1 = new int[3][3];
        int [][]arr2 = new int[3][3];
        int n;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                n = scn.nextInt();
                arr1[i][j] = n;
            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                n = scn.nextInt();
                arr2[i][j] = n;
            }
        }
        */

        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Array 1: ");
        for (int[] i : arr1) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Array 2: ");
        for (int[] i : arr2) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        int multarr[][] = new int[3][3];
        MatrixMult obj = new MatrixMult();
        multarr = obj.MatMult(arr1, arr2);

        System.out.println("Multiplied Matrix: ");
        for (int[] i : multarr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
