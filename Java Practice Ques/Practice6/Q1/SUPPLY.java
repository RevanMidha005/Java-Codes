package Practice6.Q1;
import java.util.Scanner;

public class SUPPLY {

    int code;
    String foodName,sticker,foodType;

    String getType(String sticker){
        String s_low = sticker.toLowerCase();
        if(s_low.equals("green")){
            return "Vegetarian";
        }
        else if (s_low.equals("yellow")){
            return "Contains Egg";
        }
        else if (s_low.equals("red")){
            return "Non - Vegetarian";
        }
        else{
            return "Invalid";
        }
    }

    void foodIn(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Code: ");
        code = scn.nextInt();

        //scn.nextLine(); used to clear buffer
        scn.skip("\n"); // better way

        System.out.println("Enter Name: ");
        foodName = scn.nextLine();

        System.out.println("Enter Food Sticker[Green/Yellow/Red]: ");
        sticker = scn.nextLine();

        foodType = getType(sticker);

        scn.close();
    }

    void foodOut (){
        System.out.println();
        System.out.println("Code: " + code);
        System.out.println("Name: " + foodName);
        System.out.println("Sticker: " + sticker);
        System.out.println("Type: " + foodType);
    }
}
