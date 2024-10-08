package Practice6.Q5;

public class AddStar {
    String allStar(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (i != str.length() - 1) {
                sb.append('*');
            }
        }
        return sb.toString();
    }
}
