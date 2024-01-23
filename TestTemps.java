// Name:        Jordan Rainford
// Class:       CS 3305/Section01
// Term:        Spring 2024
// Instructor:  Dr. Haddad
// Assignment:  1
// IDE Name:    IntelliJ IDEA

import java.util.*;

public class TestTemps {
    public static void main(String[] args) {

        //Imports scanner object to read user inputs
        Scanner scanner = new Scanner(System.in);

        //Allows the user to input custom temperatures
        System.out.println("Please input Monday's temperature: ");
        int mon = scanner.nextInt();
        System.out.println("Please input Tuesday's temperature: ");
        int tue = scanner.nextInt();
        System.out.println("Please input Wednesday's temperature: ");
        int wed = scanner.nextInt();
        System.out.println("Please input Thursday's temperature: ");
        int thu = scanner.nextInt();
        System.out.println("Please input Friday's temperature: ");
        int fri = scanner.nextInt();
        System.out.println("Please input Saturday's temperature: ");
        int sat = scanner.nextInt();
        System.out.println("Please input Sunday's temperature: ");
        int sun = scanner.nextInt();

        //Instantiates the array
        DailyTemps tempThisWeek = new
                DailyTemps(mon, tue, wed, thu, fri, sat, sun);

        //The folowing tests the functions in the DailyTemps class
        System.out.println("Testing function setTemps():");
        tempThisWeek.setTemp();

        System.out.println("Testing function Freezing():");
        tempThisWeek.Freezing();

        System.out.println("Testing function Warmest()");
        tempThisWeek.Warmest();

        System.out.println("Testing function printTemps():");
        tempThisWeek.printTemps();

    }
}