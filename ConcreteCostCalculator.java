import java.util.Scanner;

public class ConcreteCostCalculator {
    public static void main(String[] args) {
        // Scanner for user input (Chapter 2)
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        
        System.out.println("===========================================");
        System.out.println("  Concrete Floor System Cost Calculator");
        System.out.println("===========================================");
        
        // Main loop structure (Chapter 5)
        while (isRunning) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Calculate Material Volume and Cost");
            System.out.println("2. Exit Program");
            System.out.print("Please select an option (1 or 2): ");
            
            int choice = input.nextInt();
            
            // Selection logic (Chapter 3)
            if (choice == 1) {
                // Capturing elementary variables (Chapter 2)
                System.out.print("Enter floor slab length (feet): ");
                double length = input.nextDouble();
                
                System.out.print("Enter floor slab width (feet): ");
                double width = input.nextDouble();
                
                System.out.print("Enter slab thickness (inches): ");
                double thicknessInches = input.nextDouble();
                
                System.out.print("Enter cost per cubic yard of concrete ($): ");
                double costPerYard = input.nextDouble();
                
                // Math Functions and logical calculations (Chapter 4)
                double thicknessFeet = thicknessInches / 12.0;
                double totalVolumeCubicFeet = length * width * thicknessFeet;
                double totalVolumeCubicYards = totalVolumeCubicFeet / 27.0; 
                double totalCost = totalVolumeCubicYards * costPerYard;
                
                // Formatted String outputs (Chapter 4)
                System.out.println("\n--- Calculation Results ---");
                System.out.printf("Required Concrete Volume: %.2f cubic yards\n", totalVolumeCubicYards);
                System.out.printf("Total Estimated Cost: $%.2f\n", totalCost);
                System.out.println("---------------------------");
                
            } else if (choice == 2) {
                isRunning = false; // Breaks the loop
                System.out.println("Exiting the calculator. Goodbye!");
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        
        input.close();
    }
}
