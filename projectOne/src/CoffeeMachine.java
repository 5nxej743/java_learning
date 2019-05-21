import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int numberOfCups = scanner.nextInt();
        countAmountOfIngredients(numberOfCups);
        }

        public static void countAmountOfIngredients (int numberOfCups) {
        int amountOfWater = numberOfCups * 200;
        int amountOfMilk = numberOfCups * 50;
        int amountOfCoffeeBeans = numberOfCups * 15;
            System.out.println("For " + numberOfCups + " cups of coffee you will need:\n" + amountOfWater + " ml of water\n" + amountOfMilk + " ml of milk\n" + amountOfCoffeeBeans + " g of coffee beans");
        }
    }