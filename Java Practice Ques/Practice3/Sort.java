package Practice3;

public class Sort {
    int[] sortArr(int []arr){
        boolean flag;

        for (int i = 0; i < arr.length; i++){
            flag = false;

            for (int j = 0; j < arr.length - i -1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    flag = true;
                }
            }

            if (!flag){
                break;
            }
        }
        return arr;
    }
}
