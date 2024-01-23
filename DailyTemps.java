// Name:        Jordan Rainford
// Class:       CS 3305/Section01
// Term:        Spring 2024
// Instructor:  Dr. Haddad
// Assignment:  1
// IDE Name:    IntelliJ IDEA

import java.util.*;
public class DailyTemps {

    //Creates the weekly temperature array
    int[] Week = new int[7];

    //Imports scanner object to read user inputs
    Scanner scanner = new Scanner(System.in);

    //Overloaded Constructor to instantiate the array
    public DailyTemps(int mon, int tue, int wed, int thu,
                      int fri, int sat, int sun){
        Week[0] = mon;
        Week[1] = tue;
        Week[2] = wed;
        Week[3] = thu;
        Week[4] = fri;
        Week[5] = sat;
        Week[6] = sun;
    }

    //Sets the temperature for one specific part of the array
    public void setTemp() {
        System.out.println("What day would you like to set the temperature for?" +
                "\n---------------------" +
                "\nType 0 for Monday" +
                "\nType 1 for Tuesday" +
                "\nType 2 for Wednesday" +
                "\nType 3 for Thursday" +
                "\nType 4 for Friday" +
                "\nType 5 for Saturday" +
                "\nType 6 for Sunday");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 0:
                System.out.println("What wold you like to change the temperature to?");
                int tempMon = Integer.parseInt(scanner.nextLine());
                Week[0] = tempMon;

                System.out.println("Monday's temperature has been changed to " + Week[0]);
                break;
            case 1:
                System.out.println("What wold you like to change the temperature to?");
                int tempTue = Integer.parseInt(scanner.nextLine());
                Week[1] = tempTue;

                System.out.println("Tuesday's temperature has been changed to " + Week[1] + " degrees");

                break;
            case 2:
                System.out.println("What wold you like to change the temperature to?");
                int tempWed = Integer.parseInt(scanner.nextLine());
                Week[2] = tempWed;

                System.out.println("Wednesday's temperature has been changed to " + Week[2] + " degrees");

                break;
            case 3:
                 System.out.println("What wold you like to change the temperature to?");
                 int tempThu = Integer.parseInt(scanner.nextLine());
                 Week[3] = tempThu;

                 System.out.println("Thursday's's temperature has been changed to " + Week[3] + " degrees");

                 break;
            case 4:
                System.out.println("What wold you like to change the temperature to?");
                int tempFri = Integer.parseInt(scanner.nextLine());
                Week[4] = tempFri;

                System.out.println("Friday's temperature has been changed to " + Week[4] + " degrees");

                break;
            case 5:
                System.out.println("What wold you like to change the temperature to?");
                int tempSat = Integer.parseInt(scanner.nextLine());
                Week[5] = tempSat;

                System.out.println("Saturday's temperature has been changed to " + Week[5] + " degrees");

                break;
            case 6:
                System.out.println("What wold you like to change the temperature to?");
                int tempSun = Integer.parseInt(scanner.nextLine());
                Week[6] = tempSun;

                System.out.println("Monday's temperature has been changed to " + Week[6] + " degrees");

                break;
        }
        System.out.println("");
    }

    //Calculates and prints the number of days below freezing temperatures in the week
    public void Freezing(){
        int freezeTemp = 32;
        int frozenDays = 0;
        for ( int i = 0; i < Week.length; i++){
            if (Week[i] <= freezeTemp){
            frozenDays++;
            }
        }
        System.out.println("The number of freezing days is " + frozenDays + " day(s). \n");
    }

    //Calculates and prints the warmest day of the week
    public void Warmest(){
        int warmestDay = 0;
        int maxTemp = Integer.MIN_VALUE;

        for (int i = 0; i < Week.length; i++){
            if (Week[i] > maxTemp){
                maxTemp = Week[i];
                warmestDay = i;
            }
        }

        switch(warmestDay){
            case 0:
                System.out.println("The warmest day this week was Monday.");
                break;
            case 1:
                System.out.println("The warmest day this week was Tuesday.");
                break;
            case 2:
                System.out.println("The warmest day this week was Wednesday.");
                break;
            case 3:
                System.out.println("The warmest day this week was Thursday.");
                break;
            case 4:
                System.out.println("The warmest day this week was Friday.");
                break;
            case 5:
                System.out.println("The warmest day this week was Saturday.");
                break;
            case 6:
                System.out.println("The warmest day this week was Sunday.");
                break;
        }
        System.out.println("");
    }

    //Prints the array in an orderly fashion
    public void printTemps(){
        System.out.println("Monday \t\t" + Week[0] + "\n" +
                "Tuesday \t" + Week[1] + "\n" +
                "Wednesday \t" + Week[2] + "\n" +
                "Thursday \t" + Week[3] + "\n" +
                "Friday \t\t" + Week[4] +  "\n" +
                "Saturday \t" + Week[5] +  "\n" +
                "Sunday \t\t" + Week[6]);
    }
}
