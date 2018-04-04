package bookmanage.biz;

import java.util.List;

import bookmanage.entity.Book;

public interface BookBiz {
	public List<Book> findBook(int pageNum,int pageSize);
	
	public Book findById(int id);
	
	public int findBookCount();
	
	public void update(Book book);
	
	public void add(Book book);
	
	public void del(int id);
}
