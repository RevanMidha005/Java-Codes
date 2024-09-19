package Practice5;

public class ReplaceVow {
    String rep(String line){
        String s = "";
        for (char i : line.toCharArray()){
            char x = Character.toLowerCase(i);

            if (x == 'a'){
                s += "1";
            }
            else if (x == 'e'){
                s += "2";
            }
            else if (x == 'i'){
                s += "3";
            }
            else if (x == 'o'){
                s += "4";
            }
            else if (x == 'u'){
                s += "5";
            }
            else{
                s += i;
            }
        }
        return s;
    }
}
