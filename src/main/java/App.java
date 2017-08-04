import packages.Parcels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to WeShipAnywhere.  Please answer the following questions to determine your package volume or shipment costs.");
        boolean programRunning = true;
        while(programRunning) {
            try {
                Parcels userPackage = new Parcels();

                System.out.println("What would you like to know about your package: the 'volume', 'shipment cost, or 'exit'?");
                String navigationChoice = bufferedReader.readLine();

                if (navigationChoice.equals("volume")) {
                    System.out.println("What is the length of your package?");
                    int userInputL = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("What is the width of your package?");
                    int userInputW = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("What is the height of your package?");
                    int userInputH = Integer.parseInt(bufferedReader.readLine());
                    int volume = userPackage.calcVolume(userInputL, userInputW, userInputH);
                    System.out.println("Here is the volume of your package:" + volume);
                }
                if (navigationChoice.equals("shipment cost")) {
                    System.out.println("Enter the weight of your package in pounds.");
                    int userInputWt = Integer.parseInt(bufferedReader.readLine());
                    int shipmentCost = userPackage.costToShip(userInputWt);
                    System.out.println("Here is the cost to ship your package: $" + shipmentCost);

                } else if (navigationChoice.equals("exit")) {
                    System.out.println("Thank you for visiting our site");
                    programRunning = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
