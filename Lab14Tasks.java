import java.util.Scanner; // Import the Scanner class
public class Lab14Tasks {
    public static double calculateTicketPrice(int age, boolean hasSeniorId) {
        double ticketPrice = 0;

        if (age < 18) {
            ticketPrice = 100;
        } else if (age >= 18 && hasSeniorId) {
            ticketPrice = 1000;
        } else {
            ticketPrice = 500;
        }

        return ticketPrice;
    }
    public static void main(String[] args) {
        int age;
        boolean hasSeniorId;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character left in the buffer.

        System.out.print("Do you have a senior ID? (Yes/No): ");
        String seniorIdInput = scanner.nextLine();

        hasSeniorId = seniorIdInput.equalsIgnoreCase("Yes");

        double ticketPrice = calculateTicketPrice(age, hasSeniorId);

        System.out.println("The ticket price is: " + ticketPrice);
    }
}
