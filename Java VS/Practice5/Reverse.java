package Practice5;

public class Reverse {
    String rev(String str){
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--){
            s += str.charAt(i);
        }
        return s;
    }
}
