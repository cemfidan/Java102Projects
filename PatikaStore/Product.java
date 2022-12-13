import java.util.HashSet;
import java.util.Scanner;

public abstract class Product {

    protected int id;
    protected double unitPrice;
    protected double discountRate;
    protected int stockAmount;
    protected String name;
    protected int storage;
    protected double screenSize;
    protected int ram;
    protected boolean isRun = true;
    protected Brand brand;
    static HashSet<Brand> brandHashSet = new HashSet<>();

    protected static Scanner scanner = new Scanner(System.in);

    Product(){}

    public Product(int id, double unitPrice, double discountRate, int stockAmount, String name, Brand brand, int storage, double screenSize, int ram) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.name = name;
        this.brand = brand;
        this.storage = storage;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public abstract void add();
    public abstract void delete();
    public abstract void listById();
    public abstract void listByBrand();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Product.scanner = scanner;
    }

    public boolean isRun() {
        return isRun;
    }

    public void setRun(boolean run) {
        isRun = run;
    }
}
