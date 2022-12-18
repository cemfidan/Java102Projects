import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Book> bookList = new ArrayList<>();
		
		Book book = new Book();
		
		bookList.add(new Book("Frankenstein", 280, "Mary Shelley", 01/01/1818));
		bookList.add(new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", 10/04/1925));
		bookList.add(new Book("Moby Dick", 600, "Herman Melville", 14/11/1851));
		bookList.add(new Book("Dracula", 448, "Bram Stoker", 26/05/1897));
		bookList.add(new Book("To Kill a Mockingbird", 324, "Harper Lee", 11/07/1960));
		bookList.add(new Book("One Hundred Years of Solitude", 417, "Gabriel García Márquez", 30/05/1967));
		bookList.add(new Book("The Catcher in the Rye", 277, "J.D. Salinger", 16/07/1951));
		bookList.add(new Book("Wuthering Heights", 342, "Emily Brontë", 19/12/1847));
		bookList.add(new Book("The Picture of Dorian Gray", 352, "Oscar Wilde", 20/06/1890));
		bookList.add(new Book("The Brothers Karamazov", 863, "Fyodor Dostoevsky", 01/11/1880));
		
		Map<String, String> bookAuthorMap = bookList.stream()
				.map(books -> Map.entry(book.getBookName(), book.getAuthorName()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		List<Book> filteredBooks = book.stream()
			      .filter(book -> book.getPageCount() > 100)
			      .collect(Collectors.toList());

	}
}
