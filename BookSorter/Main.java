import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		// Sort by book name (A-Z)
		TreeSet<Book> book = new TreeSet<>();
		
		book.add(new Book("Lord of the Flies", "William Golding", 182, 1954));
		book.add(new Book("The Little Prince", "Antoine de Saint-Exupéry", 96, 1943));
		book.add(new Book("Ulysses", "James Joyce", 783, 1922));
		book.add(new Book("The Old Man and the Sea", "Ernest Hemingway", 96, 1952));

		for(Book b : book) {
			b.showInfo();
		}
		
		// Sort by book page (1..N)
		TreeSet<Book> bookPage = new TreeSet<>(new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getBookPage() - o2.getBookPage();
			}
		});
		
		for(Book b : bookPage) {
			b.showInfo();
		}
		
	}

}
