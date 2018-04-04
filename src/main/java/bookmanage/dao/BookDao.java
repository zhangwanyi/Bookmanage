package bookmanage.dao;

import java.util.List;

import bookmanage.entity.Book;

public interface BookDao {
	public List<Book> findBook(int pageNum,int pageSize);
	
	public Book findById(int id);
	
	public int findBookCount();
	
	public void update(Book book);
	
	public void add(Book book);
	
	public void del(int id);
}
