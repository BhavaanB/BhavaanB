/**
 * @author:Bhavaan Balasubramaniam
 * @date:August 17th 2023
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends ShipContainer {

    /**
     * @the main method will contain the set of instructions user must follow and based on each of the following options
     * the program will execute one of the four operations and will continue until the user exits the program
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<ShipContainer> s_Container = new ArrayList<ShipContainer>();
        int currID = 100;

        for (; ; ) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose type of details entering method");
            System.out.println("M)anual container entry");
            System.out.println("R)FID container entry");
            System.out.println("P)rint shopping container's details");
            System.out.println("Q)uit");
            System.out.println("Choice:");
            String choice = scan.nextLine();
            if (choice.equalsIgnoreCase("M")) {
                ManualContentList M_Results = new ManualContentList(currID);
                System.out.println("Enter the container contents");
                String contents1 = scan.nextLine();
                M_Results.setContents(contents1);
                s_Container.add(M_Results);
                currID += 1;
            } else if (choice.equalsIgnoreCase("R")) {
                ShippingContainerRFID scanned_results = new ShippingContainerRFID(currID);
                String response = ("y");
                while (response.equalsIgnoreCase("y")) {
                    System.out.print("Scan an RFID(Enter the container contents) ");
                    String answer = scan.nextLine();
                    scanned_results.setContents(answer);
                    System.out.print("Would you like to scan  another RFID? (y/n) ");
                    response = scan.nextLine();
                }
                s_Container.add(scanned_results);
                currID += 1;
            } else if (choice.equalsIgnoreCase("P")) {
                System.out.println("***** Shipping Container's details *****");
                for (ShipContainer input_item : s_Container) {
                    System.out.print("Container ");
                    input_item.printContent();
                    System.out.print(" contains ");
                    String results_s = input_item.containerContentList();
                    System.out.println(" " + results_s);
                }

            } else if (choice.equalsIgnoreCase("Q")) {
                System.exit(0);
            } else {
                System.out.print("You have not chose any of the options below,please input an option again");
            }
        }


    }
}