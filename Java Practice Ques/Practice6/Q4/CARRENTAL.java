package Practice6.Q4;
import java.util.Scanner;

public class CARRENTAL {
    int CarID, rent;
    String CarType;

    void getCar(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Car ID: ");
        CarID = scn.nextInt();

        scn.skip("\n");

        System.out.println("Enter Car Type[Small Car/Van/SUV]: ");
        CarType = scn.nextLine();

        scn.close();
    }

    int getRent(){
        if (CarType.equals("Small Car")){
            rent = 1000;
        }
        else if (CarType.equals("Van")){
            rent = 800;
        }
        else if (CarType.equals("SUV")){
            rent = 2500;
        }
        return rent;
    }

    void ShowCar(){
        System.out.println();
        System.out.println("Car ID: " + CarID);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + getRent());
    }
}
