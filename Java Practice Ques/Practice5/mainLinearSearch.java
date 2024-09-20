package Practice5;
import java.util.Scanner;

public class mainLinearSearch {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);

        System.out.println("Enter the string: ");
        String line = scn.nextLine();
        System.out.println("Enter the string to be searched: ");
        String search = scn.nextLine();

        LinearSearch obj4 = new LinearSearch();
        int idx = obj4.linearSearch(line, search);

        if (idx != -1){
            System.out.println("Found at index: " + idx);
        }
        else{
            System.out.println("Not found");
        }
    }
}
