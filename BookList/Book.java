import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Book {
	
	private String bookName;
	private int pageNum;
	private String authorName;
	private Date date;
	
	ArrayList<Book> bookList = new ArrayList<>();
	
	public Book (){}
	
	public Book(String bookName, int pageNum, String authorName, Date date) {
		super();
		this.bookName = bookName;
		this.pageNum = pageNum;
		this.authorName = authorName;
		this.date = date;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
