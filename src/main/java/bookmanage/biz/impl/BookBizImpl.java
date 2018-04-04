package bookmanage.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookmanage.biz.BookBiz;
import bookmanage.dao.BookDao;
import bookmanage.entity.Book;

@Service
public class BookBizImpl implements BookBiz{

	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<Book> findBook(int pageNum, int pageSize) {
		return bookDao.findBook(pageNum, pageSize);
	}

	@Override
	public int findBookCount() {
		return bookDao.findBookCount();
	}

	@Override
	public void update(Book book) {
		bookDao.update(book);
	}

	@Override
	public void add(Book book) {
		bookDao.add(book);
	}

	@Override
	public void del(int id) {
		bookDao.del(id);
	}

	@Override
	public Book findById(int id) {
		return bookDao.findById(id);
	}

}
