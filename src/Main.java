import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter electrical consumption in KWH: ");

        int electricityUsage = scanner.nextInt();

        double billAmount;

        if (electricityUsage <= 50){
            billAmount = electricityUsage * 10;
        } else if (electricityUsage <= 150){
            billAmount = 50 * 10 + (electricityUsage - 50) * 16;
        } else if (electricityUsage <= 250){
            billAmount = 50 * 10 + 100 * 16  + (electricityUsage - 150 ) * 22;
        }else {
            billAmount = 50 * 10 + 100 * 16 + 100  * 22 + (electricityUsage - 250) * 30;
        }
        double ExtraCharge = (electricityUsage <= 250) ? 7 : 12; // used ternary operator instead of if else
        billAmount += billAmount;

        System.out.println("Total Electricity bill is: $" + billAmount);
    }
}