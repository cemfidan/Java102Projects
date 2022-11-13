
public class Book implements Comparable<Book> {

	private String bookName;
	private String authorName;
	private int bookPage;
	private int publishDate;

	public Book(String bookName, String authorName, int bookPage, int publishDate) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPage = bookPage;
		this.publishDate = publishDate;
	}

	@Override
	public int compareTo(Book o) {
		return this.getBookName().compareTo(o.bookName);
	}

	public void showInfo() {
		System.out.println("Name: " + getBookName() + "\nAuthor: " + getAuthorName() + "\nPage Number: " + getBookPage() + "\nPublish Date: " + getPublishDate());
		System.out.println("************************************");
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getBookPage() {
		return bookPage;
	}

	public void setBookPage(int bookPage) {
		this.bookPage = bookPage;
	}

	public int getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(int publishDate) {
		this.publishDate = publishDate;
	}

}
