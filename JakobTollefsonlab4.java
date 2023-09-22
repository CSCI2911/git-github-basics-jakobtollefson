
import java.io.*;
import java.util.*;

public class JakobTollefsonlab4 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int number;
        Scanner keyboard = new Scanner(System.in);
        // Open the file.
        System.out.println("***File operations menu***\n"
                + "1. Enter Sales Figures (in File)-must be done first\n"
                + "2. Display Sales Figures\n"
                + "3. Display Total Sales\n"
                + "4. Exit Program");
        System.out.println("Enter selection 1 through 4: ");
        int choice = keyboard.nextInt();
        // Get data and write it to the file.
        if (choice == 1) {
            PrintWriter outputFile = new PrintWriter("Sales.txt");
            // Get the number
            System.out.println("how many weeks of figures do you have to enter? ");
            number = keyboard.nextInt();
            for (int figures = 0; figures < number; figures++) {
                System.out.println("Enter sales: " + (figures + 1));
                double sales = keyboard.nextDouble();
                outputFile.println(sales);

            }

            // Close the file. 
            outputFile.close();

            System.out.println("***File operations menu***\n"
                    + "1. Enter Sales Figures (in File)-must be done first\n"
                    + "2. Display Sales Figures\n"
                    + "3. Display Total Sales\n"
                    + "4. Exit Program");
            System.out.println("Enter selection 1 through 4: ");
            choice = keyboard.nextInt();
            if (choice == 2) {
                System.out.println("your sales figure: ");
                File file = new File("sales.txt");
                Scanner inputFile = new Scanner(file);
                // Read all of the values from the file
                while (inputFile.hasNext()) {
                    // Read a value from the file.
                    double salesNumbers = inputFile.nextDouble();
                    System.out.println(salesNumbers);

                }
                System.out.println("***File operations menu***\n"
                        + "1. Enter Sales Figures (in File)-must be done first\n"
                        + "2. Display Sales Figures\n"
                        + "3. Display Total Sales\n"
                        + "4. Exit Program");
                System.out.println("Enter selection 1 through 4: ");
                choice = keyboard.nextInt();
            }
            if (choice == 3) {
                double totalSales = 0;
                System.out.println("Displayed total sales: ");
                File file = new File("sales.txt");
                Scanner inputFile = new Scanner(file);
                // Read all of the values from the file
                while (inputFile.hasNext()) {
                    // Read a value from the file.
                    double salesNumbers = inputFile.nextDouble();
                    totalSales = totalSales + salesNumbers;
                }
                System.out.println(totalSales);

                // Close the file.
                inputFile.close();

                System.out.println("***File operations menu***\n"
                        + "1. Enter Sales Figures (in File)-must be done first\n"
                        + "2. Display Sales Figures\n"
                        + "3. Display Total Sales\n"
                        + "4. Exit Program");
                System.out.println("Enter selection 1 through 4: ");
                choice = keyboard.nextInt();
                if (choice == 4) {
                    System.out.println("Thank you for using this program. ");
                }
            }
        }

    }

}
