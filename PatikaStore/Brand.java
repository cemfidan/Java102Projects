import java.util.TreeSet;

public class Brand {

    private int id;
    private String name;

    static TreeSet<Brand> brandArrayList = new TreeSet<>(new BrandByNameComparator());

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Brand(){}

    public void run(){
        addBrand();
        sortBrand();
    }

    public static void addBrand(){
        brandArrayList.add(new Brand(1, "Samsung"));
        brandArrayList.add(new Brand(2, "Lenovo"));
        brandArrayList.add(new Brand(3, "Apple"));
        brandArrayList.add(new Brand(4, "Huawei"));
        brandArrayList.add(new Brand(5, "Casper"));
        brandArrayList.add(new Brand(6, "Asus"));
        brandArrayList.add(new Brand(7, "HP"));
        brandArrayList.add(new Brand(8, "Xiaomi"));
        brandArrayList.add(new Brand(9, "Monster"));
    }

    public static void sortBrand(){
        for(Brand brand : brandArrayList){
            System.out.println(brand.getName());
        }
    }

    public static void sortByIdBrand(){
        System.out.println("======================================");
        for(Brand brand : brandArrayList){
            System.out.println("Brand: " + brand.getName() + "  | ID: " + brand.getId());
        }
        System.out.println("======================================");
    }

    public static Brand showBrand(int num){
        for (Brand brand : brandArrayList){
            if(num == brand.getId()){
                return brand;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
