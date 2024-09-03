package program1;
import java.util.Scanner;
public class pro7 {
	

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of days : ");
	        int overdueDays = scanner.nextInt();

	     
	        if (overdueDays < 0) {
	            System.out.println("Invalid number of days. Please enter a non-negative number.");
	        } else if (overdueDays == 0) {
	            System.out.println("No fine. The book is returned on time.");
	        } else if (overdueDays >= 1 && overdueDays <= 10) {
	            int fine = overdueDays * 10;
	            System.out.printf("Fine: Rs. %d\n", fine);
	        } else if (overdueDays >= 11 && overdueDays <= 20) {
	            int fine = overdueDays * 20;
	            System.out.printf("Fine: Rs. %d\n", fine);
	        } else if (overdueDays >= 21 && overdueDays <= 30) {
	            int fine = overdueDays * 30;
	            System.out.printf("Fine: Rs. %d\n", fine);
	        } else if (overdueDays > 30) {
	            System.out.println("Membership cancelled due to excessive overdue days.");
	        }

	      
	        scanner.close();
	    }
	}


