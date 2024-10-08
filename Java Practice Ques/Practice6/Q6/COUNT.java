package Practice6.Q6;
import java.util.Scanner;

public class COUNT {
    String s;
    int cy = 0, cz = 0;
    char c;

    void inp(){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter String: ");
        s = scn.nextLine();

        scn.close();
    }

    int locateYZ(String i, int len){
        int x = 1;
        c = i.charAt(len - 1);

        while (! Character.isLetter(c)){
            x++;
            c = i.charAt(len - x);
        }
        return (len - x);
    }

    void countYZ(){
        String[]a  = s.split(" ", 0);

        for (String i : a){
            int len = i.length();
            int x = len - 1;
            i = i.toLowerCase();

            c = i.charAt(x);
            if (! Character.isLetter(c)){
                x = locateYZ(i, len);
            }

            if (i.charAt(x) == 'z'){
                cz += 1;
            }
            else if (i.charAt(x) == 'y') {
                cy += 1;
            }
        }

        System.out.println("No. of Words Ending y/z: " + (cy + cz));
    }
}
