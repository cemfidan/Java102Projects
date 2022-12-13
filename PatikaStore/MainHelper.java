import java.util.Scanner;

public class MainHelper {

	
    public void run(){
        showMenu();
    }

    public void showMenu(){
        boolean isRun = true;

        Scanner scanner = new Scanner(System.in);

        while (isRun) {
            System.out.println("\n========================================");
            System.out.println("\nPatikaStore Product Management Panel\n");
            System.out.println("1 - Notebook Transactions\n"
                    + "2 - Phone Transactions\n"
                    + "3 - List Brand\n"
                    + "0 - Exit");
            System.out.print("\nYour choice: ");
            int select = scanner.nextInt();
            System.out.println("\n========================================");

            switch (select) {
                case 0:
                    System.out.println("Log out!");
                    isRun = false;
                    break;
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.run();
                    break;
                case 2:
                    Phone phone = new Phone();
                    phone.run();
                    break;
                case 3:
                    Brand brand = new Brand();
                    brand.run();
                    break;
                default:
                    System.out.println("Invalid number, try again.");
                    break;
            }
        }
        scanner.close();
    }
	
}
