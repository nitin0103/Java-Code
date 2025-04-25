import java.util.Scanner;

public class VehicleCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int V = sc.nextInt();
        int W = sc.nextInt();

        // Validate input constraints
        if (V < 1 || W < 2 || W % 2 != 0 || V > W) {
            System.out.println("INVALID INPUT");
        } else {
            int FW = (W - 2 * V) / 2;
            int TW = V - FW;

            // Final validation
            if (FW < 0 || TW < 0) {
                System.out.println("INVALID INPUT");
            } else {
                System.out.println(TW + " " + FW);
            }
        }

        sc.close();
    }
}
