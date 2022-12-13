import java.util.ArrayList;

public class Phone extends Product{

    private String colour;
    private int battery;

    static ArrayList<Phone> phoneArrayList = new ArrayList<>();

    Phone(){}

    public Phone(int id, double unitPrice, double discountRate, int stockAmount, String name, Brand brand, int storage, double screenSize, int ram, String colour, int battery) {
        super(id, unitPrice, discountRate, stockAmount, name, brand, storage, screenSize, ram);
        this.colour = colour;
        this.battery = battery;
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
        System.out.print("Colour: ");
        String colour = scanner.nextLine();
        System.out.println("Battery: ");
        int battery = scanner.nextInt();

        phoneArrayList.add(new Phone(id, unitPrice, discountRate, stockAmount, name, brand, storage, screenSize, ram, colour, battery));

        System.out.println("\nPhone added!");
    }

    @Override
    public void delete() {
        listById();
        System.out.print("Which ID will you delete: ");
        int select = scanner.nextInt();
        phoneArrayList.remove(select - 1);
        System.out.println("\nPhone deleted!");
    }

    @Override
    public void listById() {
        showPhone(null);
    }

    @Override
    public void listByBrand() {
        System.out.println("Enter the brand: ");
        String listBrand = scanner.nextLine();
        ArrayList<Phone> brandArrayList = new ArrayList<>();
        for (Phone phone : phoneArrayList){
            if(listBrand.equals(phone.getBrand().getName())){
                brandArrayList.add(phone);
            }
        }
    }

    public void showPhone(ArrayList<Phone> phoneList) {
        if(phoneList == null) phoneList = this.phoneArrayList;
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Name                  | Brand          | Unit Price         | Discount Rate        | Stock Amount      | Storage    | Screen Size      |  RAM  |  Renk   |   Kamera  ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Phone p : phoneList){
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | %-9s |\n",
                    p.getId(),p.getName(),p.getBrand().getName(),p.getUnitPrice(),p.getDiscountRate(),
                    p.getStockAmount(),p.getStorage(),p.getScreenSize(),p.getRam(),p.getColour(),p.getColour());
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
