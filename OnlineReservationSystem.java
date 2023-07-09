import java.util.Scanner;

public class OnlineReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;
        
        while (!loggedIn) {
            System.out.print("Enter yo1ur login ID: ");
            String loginId = scanner.nextLine();
            
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            
            if (isValidLogin(loginId, password)) {
                loggedIn = true;
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid login credentials. Please try again.");
            }
        }
        
        // User is now logged in, show reservation menu
        System.out.println("Welcome to the Online Reservation System!");
        System.out.println("1. Make a reservation");
        System.out.println("2. Cancel a reservation");
        System.out.println("3. Exit");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        switch (choice) {
            case 1:
                makeReservation();
                break;
            case 2:
                cancelReservation();
                break;
            case 3:
                System.out.println("Thank you for using the Online Reservation System. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        
        scanner.close();
    }
    
    public static boolean isValidLogin(String loginId, String password) {
        // Implement your own logic to validate login credentials
        // For demonstration purposes, this method always returns true
        return true;
    }
    
    public static void makeReservation() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your basic details: ");
        String basicDetails = scanner.nextLine();
        
        System.out.print("Enter train number: ");
        String trainNumber = scanner.nextLine();
        
        System.out.print("Enter class type: ");
        String classType = scanner.nextLine();
        
        System.out.print("Enter date of journey: ");
        String dateOfJourney = scanner.nextLine();
        
        System.out.print("Enter source (place): ");
        String source = scanner.nextLine();
        
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();
        
        //Save the reservation details to the database
        
        System.out.println("Reservation successfully made!");
        
        scanner.close();
    }
    
    public static void cancelReservation() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your PNR number: ");
        String pnrNumber = scanner.nextLine();
        
        // Retrieve reservation details from the database using PNR number
        
        System.out.println("Reservation details:");
        // Display reservation details
        
        System.out.print("Press 'OK' to confirm cancellation: ");
        String confirmation = scanner.nextLine();
        
        if (confirmation.equalsIgnoreCase("OK")) {
            // Cancel the reservation in the database
            
            System.out.println("Reservation successfully canceled!");
        } else {
            System.out.println("Cancellation not confirmed. Reservation is still valid.");
        }
        
        scanner.close();
    }
}
