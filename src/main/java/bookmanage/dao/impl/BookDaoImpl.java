package bookmanage.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import bookmanage.dao.BookDao;
import bookmanage.entity.Book;

@Repository
public class BookDaoImpl implements BookDao{

	@Autowired
	private HibernateTemplate hi;
	
	public List<Book> findBook(int pageNum, int pageSize) {
		return hi.execute(new HibernateCallback<List<Book>>() {
			public List<Book> doInHibernate(Session arg0) throws HibernateException, SQLException {
				Criteria cri=arg0.createCriteria(Book.class);
				cri.setFirstResult((pageNum-1)*pageSize);
				cri.setMaxResults(pageSize);
				return cri.list();
			}
		});
	}

	public int findBookCount() {
		return hi.execute(new HibernateCallback<Integer>() {
			public Integer doInHibernate(Session arg0) throws HibernateException, SQLException {
				Criteria cri=arg0.createCriteria(Book.class);
				Projection proj=Projections.count("id");
				cri.setProjection(proj);
				Number nu=(Number)cri.uniqueResult();
				return nu.intValue();
			}
		});
	}

	public void update(Book book) {
		hi.update(book);
	}

	public void add(Book book) {
		hi.save(book);
	}

	public void del(int id) {
		hi.delete(hi.get(Book.class, id));
	}

	@Override
	public Book findById(int id) {
		return hi.get(Book.class, id);
	}

}
