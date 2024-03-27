import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter electrical consumption in KWH: ");

        int electricityUsage = scanner.nextInt();

        double billAmount;

        if (electricityUsage <= 50){
            billAmount = electricityUsage * 0.10;
        } else if (electricityUsage <= 150){
            billAmount = 50 * 0.10 + (electricityUsage - 50) * 0.16;
        } else if (electricityUsage <= 250){
            billAmount = 50 * 0.10 + 100 * 0.16  + (electricityUsage - 150 ) * 0.22;
        }else {
            billAmount = 50 * 0.10 + 100 * 0.16 + 100  * 0.22 + (electricityUsage - 250) * 0.30;
        }
        double ExtraCharge = (electricityUsage <= 250) ? 7 : 12; // used ternary operator instead of if else
        billAmount += billAmount;

        System.out.println("Total Electricity bill is: $" + billAmount);
    }
}