 public class Main {

	public static void main(String[] args) {
		
		MyList<Integer> list = new MyList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(20);
		list.add(50);
        list.add(60);
        list.add(70);
        
        System.out.println("Number of elements in the array: " + list.size());
        System.out.println("Array Capacity: " + list.getCapacity());
        System.out.println("value at the entered index: " + list.get(1));
        System.out.println("deleted value : " + list.remove(4));
        System.out.println("After replacing the element in the index : " + list.set(2, 500));
        System.out.println("My list: " + list.toString());
        System.out.println("index of entered data in array " + list.indexOf(90));
        System.out.println("last index of: " + list.lastIndexOf(80));
        System.out.println(list.isEmpty());
		
	}

}
