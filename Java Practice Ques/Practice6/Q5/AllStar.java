package Practice6.Q5;

public class AllStar {
    String allStar(String str, int first){
        if (first == str.length() - 1){
            return (str.charAt(first) + "");
        }
        return str.charAt(first) + "*" + allStar(str, first + 1);
    }

    public static void main(String[] args) {
        AllStar a = new AllStar();
        String str = "hello";
        int first = 0;

        System.out.println("Original String: " + str);
        String replacedStr = a.allStar(str, first);
        System.out.println("Replaced String: " + replacedStr);
    }
}
