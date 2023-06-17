package coffeeMachineSimulator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);

        boolean exit = false;
        String order = "";
        while(!exit) {
            System.out.println("Write action (Coffee Dispenser, Brew, Retrieval , Supply Status, Power Down)");
            order = scanner.nextLine();

            if (order.equals("Coffee Dispenser")) {
                CoffeeMachine.buy(coffeeMachine);
            } else if (order.equals("Brew")) {
                CoffeeMachine.fill(coffeeMachine);
            } else if (order.equals("Retrieval")) {
                CoffeeMachine.take(coffeeMachine);
            } else if (order.equals("Supply Status")) {
                CoffeeMachine.showSupply(coffeeMachine);
            } else if (order.equals("Power Down")) {
                exit = true;
            }
        }
    }
}
