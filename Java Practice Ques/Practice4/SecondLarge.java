package Practice4;

public class SecondLarge {
    void dispSecondLarge(String[] arr) {
        String maxi = "";
        String smaxi = "";

        for (String s : arr){
            if (s.length() >= maxi.length()){
                smaxi = maxi;
                maxi = s;
            }
        }
        System.out.println(smaxi);
    }
}




