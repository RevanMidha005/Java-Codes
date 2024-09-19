package Practice4;

public class SecondLarge {
    void dispSecondLarge(String[] arr) {
        int[] lenarr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            lenarr[i] = arr[i].length();
        }

        int maxi = lenarr[0];
        for (int i = 1; i < lenarr.length; i++) {
            if (lenarr[i] > maxi) {
                maxi = lenarr[i];
            }
        }

        int s_max = lenarr[0];

        for (int i = 0; i < lenarr.length; i++) {
            if (lenarr[i] != maxi) {
                if (lenarr[i] > s_max) {
                    s_max = lenarr[i];
                }
            }

        }
        for (int i = 0; i < lenarr.length; i++) {
            if (lenarr[i] == s_max) {
                System.out.println(arr[i]);
                break;
            }
        }

    }
}




