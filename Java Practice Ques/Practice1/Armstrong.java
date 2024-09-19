package Practice1;

public class Armstrong {
    void displayArmstrong(int n) {
        int t = n, d, s = 0, c = 0;

        t = n;
        s = 0;
        c = 0;

        while (t != 0) {
            c += 1;
            t /= 10;
        }

        t = n;
        while (t != 0) {
            d = t % 10;
            s += (int) Math.pow(d, c);
            t /= 10;
        }

        if (s == n) {
            System.out.print(s + " ");
        }

    }
}
