package Practice;

public class Armstrong {

    void isArmstrong() {
        int t,d,s;
        int c;

        for (int i = 1; i <= 500; i++ ){
            t = i;
            s = 0;
            c = 0;

            while (t != 0){
                c += 1;
                t /= 10;
            }

            t = i;
            while (t != 0){
                d = t % 10;
                s += (int)Math.pow(d,c);
                t /= 10;
            }

            if (s == i){
                System.out.print(s + " ");
            }
        }
    }
}
