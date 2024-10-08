package Practice1;

public class mainArm{
    public static void main(String[] args) {
        Armstrong obj = new Armstrong();

        for (int i = 1; i <= 2000; i++){
            obj.displayArmstrong(i);
        }
    }
}
