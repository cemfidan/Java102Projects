import java.util.ArrayList;

public class Notebook extends Product{

    static ArrayList<Notebook> notebookArrayList = new ArrayList<>();

    Notebook(){}

    Notebook(int id, double unitPrice, double discountRate, int stockAmount, String name, Brand brand, int storage, double screenSize, int ram) {
        super(id, unitPrice, discountRate, stockAmount, name, brand, storage, screenSize, ram);
    }

    public void run(){
        while(isRun) {
            System.out.println("\n========================");
            System.out.println("Notebook Menu");
            System.out.println("1 - List Notebook By ID\n" +
                    "2 - List Notebook By Brand\n" +
                    "3 - Add Notebook\n" +
                    "4 - Delete Notebook\n" +
                    "0 - Exit");
            System.out.print("Your choice: ");
            int select = scanner.nextInt();
            System.out.println("========================\n");
            switch (select){
                case 0:
                    System.out.println("Log out!");
                    isRun = false;
                    break;
                case 1:
                    listById();
                    break;
                case 2:
                    listByBrand();
                    break;
                case 3:
                    add();
                    break;
                case 4:
                    delete();
                    break;
                default:
                    System.out.println("Invalid number, try again.");
                    break;
            }
        }
    }

    @Override
    public void add() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.println("Name: ");
        String name = scanner.next();
        Brand.sortByIdBrand();
        System.out.println("Brand: ");
        Brand brand = Brand.showBrand(scanner.nextInt());
        System.out.print("Unit Price: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Discount Rate: ");
        double discountRate = scanner.nextDouble();
        System.out.print("Stock Amount: ");
        int stockAmount = scanner.nextInt();
        System.out.print("Storage: ");
        int storage = scanner.nextInt();
        System.out.print("Screen Size: ");
        double screenSize = scanner.nextDouble();
        System.out.print("RAM: ");
        int ram = scanner.nextInt();

        notebookArrayList.add(new Notebook(id,unitPrice,discountRate,stockAmount,name,brand,storage,screenSize,ram));

        System.out.println("\nNotebook added!");
    }

    @Override
    public void delete() {
        listById();
        System.out.print("Which ID will you delete: ");
        int select = scanner.nextInt();
        notebookArrayList.remove(select - 1);
        System.out.println("\nNotebook deleted!");
    }

    @Override
    public void listById() {
        showNotebook(null);
    }

    @Override
    public void listByBrand() {
        System.out.println("Enter the brand: ");
        String listBrand = scanner.nextLine();
        ArrayList<Notebook> brandArrayList = new ArrayList<>();
        for (Notebook notebook : notebookArrayList){
            if(listBrand.equals(notebook.getBrand().getName())){
                brandArrayList.add(notebook);
            }
        }
    }

    public void showNotebook(ArrayList<Notebook> notebookList) {
        if(notebookList == null) notebookList = this.notebookArrayList;
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Name                  | Brand          | Unit Price         | Discount Rate        | Stock Amount      | Storage    | Screen Size      | RAM   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Notebook n : notebookList){
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                    n.getId(),n.getName(),n.getBrand().getName(),n.getUnitPrice(),n.getDiscountRate(),
                    n.getStockAmount(),n.getStorage(),n.getScreenSize(),n.getRam());
        }
    }
}
