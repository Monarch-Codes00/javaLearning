package abc.com;

import java.util.*;

public class Aptechtask {


    public static void task1(Scanner sc) {
            System.out.print("Enter number of daily reports: ");
                    int n = sc.nextInt();

        int[] discoveries = new int[n];

        System.out.println("Enter the discovery values:");
             for    (int i = 0; i < n; i++) {

            discoveries[i] = sc.nextInt();
        }

        int  max = discoveries[0];

         int position = 0;

        for (int i = 1; i < discoveries.length; i++) {

            if (discoveries[i] > max) {

                    max = discoveries[i];
                position = i;
            }
        }

        System.out.println("Highest discovery: " + max + " barrels at position " + position);
    }


    public static void task2() {

            int[] deliveries = {1200, 1800, 1500, 2000, 1750, 1400, 1650};

        int total = 0;

                for (int i = 0; i < deliveries. length; i++) {

            total += deliveries [i];
        }

            System.out.println("Total delivered: " +  total + " liters");

        if (total > 10000) {
                System.out.println  ("ALERT: Capacity Exceeded!");
        }
    }


    public static void task3() {

        int[] defects = {2, 8, 1, 0, 6, 7, 3, 9, 5};

        System.out.print("[ ");
            for (int i = 0; i < defects.length; i++) {

                 if (defects[i] > 5) {
                System.out.print(defects[i] + " ");

            }
        }
        System.out.println("]");
    }

    public static void task4() {
        int[][] medicines = {{5, 0, 0, 4, 6, 5, 4}, {3, 1, 0, 2, 0, 1, 2},  {0, 0, 0, 0, 0, 0, 0}
        };


        for (int i = 0; i < medicines.length; i++) {

                boolean hasConsecutiveZeros = false;

            for (int j = 0; j   < medicines[i].length - 1; j++) {


                     if    (medicines[i][j] == 0 && medicines[i][j + 1] == 0) {

                        hasConsecutiveZeros = true;
                    break;
                }
            }

            if (hasConsecutiveZeros) {
                    System.out.println(Arrays.toString(medicines[i]));
            }
        }
    }


    public static void task5() {
        int[][] routes = {
                    {80, 90, 120},
                {105, 110, 115},
                        {70, 85, 95},
                            {130, 140, 125}
        };

        System.out.print("[ ");
        for (int i = 0; i < routes.length; i++) {

                  int sum = 0;
            for    (int j = 0; j < routes[i].length; j++) {

                sum  += routes[i][j];

            }
            int average = sum / routes[i].  length;

                 if (average >=  100) {
                System.out. print(average + " ");
            }
        }
            System.out.println("]");
    }


    public static void task6() {

            int[] yields = {45,  60, 38, 55, 70 , 42,  39, 48};

                int min = yields[0];
        int day = 0;

        for (int i = 1; i < yields. length; i++) {

            if (  yields[i] <   min) {
                      min = yields[i];

                day = i;
            }
        }

        System.out.println("Lowest yield: " + min + " bags on day " + day);
    }

    public static void task7() {

        int[][] readings = {
                {120, 80}, {150, 95}, {138, 85}, {145, 92}, {160, 100}
        };

        System.out.print("[ ");

             for  (int  i = 0; i < readings.  length; i++) {

            if (readings[i][0] > 140) {

                System.out.print(Arrays.toString(readings[i]) + " ");
            }
        }
        System.out.println("]");
    }

    // MAIN MENU
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== JAVA ASSIGNMENT MENU ===");
            System.out.println("1. Highest Single-Day Discovery");
            System.out.println("2. Total Deliveries with Capacity Check");
            System.out.println("3. Defective Parts Exceeding 5");
            System.out.println("4. Zero Consumption Detection");
            System.out.println("5. Bus Route Averages ≥ 100");
            System.out.println("6. Lowest Yield Day");
            System.out.println("7. Hypertension Readings");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: task1(sc); break;

                    case 2: task2(); break;
                    case 3: task3(); break;

                    case 4: task4(); break;

                      case 5: task5(); break;
                     case 6: task6(); break;
                   case 7: task7(); break;

                    case 0: System.out.println("Exiting..."); break;

                    default: System.out.println("Invalid choice, try again!");
            }
        } while (choice != 0);

        sc.close();
    }
}
