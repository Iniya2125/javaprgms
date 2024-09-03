package program1;
import java.util.Scanner;

public class pro3 {
	 public static void main(String[] args) {
	
		         Scanner scanner = new Scanner(System.in);
		         System.out.print("Enter a number to display its multiplication table: ");
		         int number = scanner.nextInt();

		         System.out.println("Multiplication Table for " + number + ":");
		         for (int i = 1; i <= 20; i++) {
		             System.out.printf("%d x %d = %d\n", number, i, number * i);
		         }

		      
		         scanner.close();
		     }
		 

	 }

// using for loop 
package program1;
import java.util.Scanner;
public class pro4 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to display its multiplication table: ");
	        int number = scanner.nextInt();
	        System.out.println("Multiplication Table for " + number + ":");
	        int i = 1;
	        while (i <= 16) {
	            System.out.printf("%d x %d = %d\n", number, i, number * i);
	            i++;
	        }
	        scanner.close();
	    }
	}


