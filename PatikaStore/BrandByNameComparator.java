import java.util.Comparator;

public class BrandByNameComparator implements Comparator<Brand> {
    @Override
    public int compare(Brand o1, Brand o2) {
        return o1.getName().compareTo(o2.getName());
    }
}