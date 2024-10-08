package Practice6.Q3;
import java.util.Scanner;

public class Candidate {
    int rno;
    String name, remarks;
    double score;

    String assignRem(){
        if (score >= 50){
            remarks = "Selected";
        }
        else {
            remarks = "Not Selected";
        }
        return remarks;
    }

    void ENTER(){
        Scanner scn =  new Scanner(System.in);

        System.out.print("Enter Rno: ");
        rno = scn.nextInt();

        scn.skip("\n");

        System.out.print("Enter Name: ");
        name = scn.nextLine();

        System.out.print("Enter Score: ");
        score = scn.nextDouble();

        remarks = assignRem();

        scn.close();
    }

    void DISPLAY(){
        System.out.println();
        System.out.println("Rno: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Remarks: " + remarks);
    }
}
