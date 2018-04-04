package bookmanage.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import bookmanage.biz.BookBiz;
import bookmanage.entity.Book;

@Component
@Scope("prototype")
public class BookAction extends ActionSupport{
	
	@Autowired
	private BookBiz bookBiz;
	
	private List<Book> bookList;
	private Book book;
	private int page;
	private int pageSize;
	private int count;
	private int yeshu;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getYeshu() {
		return yeshu;
	}

	public void setYeshu(int yeshu) {
		this.yeshu = yeshu;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public String index() {
		if(page==0)page=1;
		if(pageSize==0)pageSize=5;
		bookList=bookBiz.findBook(page, pageSize);
		count=bookBiz.findBookCount();
		yeshu=count%pageSize==0?count/pageSize:count/pageSize+1;
		return SUCCESS;
	}
	public String edit() {
		book=bookBiz.findById(id);
		return SUCCESS;
	}
	public String save() {
		if(book.getId()==0) {
			bookBiz.add(book);
		}else {
			bookBiz.update(book);
		}
		return SUCCESS;
	}
	public String del() {
		bookBiz.del(id);
		return SUCCESS;
	}
}
