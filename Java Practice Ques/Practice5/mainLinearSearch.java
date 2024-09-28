package Practice5;
import java.util.Scanner;

public class mainLinearSearch {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);

        System.out.println("Enter string: ");
        String line = scn.nextLine();
        System.out.println("Enter string to be searched: ");
        String search = scn.nextLine();

        LinearSearch obj = new LinearSearch();
        int idx = obj.linearSearch(line, search);

        if (idx != -1){
            System.out.println("Word Position: " + (idx + 1));
        }
        else{
            System.out.println("Not found");
        }
    }
}
