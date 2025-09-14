import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car mark: ");
        String brand = scanner.nextLine().trim();

        System.out.print("Enter car model: ");
        String model = scanner.nextLine().trim();

        int year = 0;
        while (year <= 0) {
            System.out.print("Enter the release year: ");
            String y = scanner.nextLine().trim();
            try {
                year = Integer.parseInt(y);
                if (year <= 0) System.out.println("The year must be greater than 0.");
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input..");
            }
        }

        System.out.print("Enter the car colour: ");
        String color = scanner.nextLine().trim();

        System.out.print("Enter engine type: ");
        String engineType = scanner.nextLine().trim();

        Car userCar = new Car.Builder()
                .brand(brand)
                .model(model)
                .year(year)
                .color(color)
                .engineType(engineType)
                .build();

        System.out.println("\nYour car created succesfully:");
        System.out.println(userCar);

        scanner.close();
    }
}
