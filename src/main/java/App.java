import packages.Parcels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {

            ArrayList<Parcels> allPackages = new ArrayList<Parcels>();

            System.out.println("What is the length of your package?");
            int userInputL = Integer.parseInt(bufferedReader.readLine());
            System.out.println("What is the width of your package?");
            int userInputW = Integer.parseInt(bufferedReader.readLine());
            System.out.println("What is the height of your package?");
            int userInputH = Integer.parseInt(bufferedReader.readLine());
            System.out.println("What is the weight of your package in pounds?");
            int userInputWt = Integer.parseInt(bufferedReader.readLine());

            Parcels userPackage = new Parcels(userInputL, userInputW, userInputH, userInputWt);
            allPackages.add(userPackage);

            int volume = userPackage.volume(userInputL, userInputW, userInputH);
            System.out.println("Here is the volume of your package:" + volume);
            System.out.println("Based on your inputs, here is the cost to ship your package:");
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
