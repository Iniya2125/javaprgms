package program1;

import java.util.Scanner;




public class pro5 {

    public static void main(String[] args) {

       

        Scanner scanner = new Scanner(System.in);




        System.out.print("Enter the days: ");

        int day = scanner.nextInt();



      

        if (day < 1 || day > 31) {

            System.out.println("Invalid day. Please enter a number between 1 and 31.");

        } else {

           

            String week;

            if (day >= 1 && day <= 7) {

                week = "First Week";

            } else if (day >= 8 && day <= 14) {

                week = "Second Week";

            } else if (day >= 15 && day <= 21) {

                week = "Third Week";

            } else if (day >= 22 && day <= 31) {

                week = "Fourth Week";

            } else {

                week = "Invalid Day";

            }



            // Display the result

            System.out.printf("Day %d falls in the %s.\n", day, week);

        }



   

        scanner.close();

    }

}

