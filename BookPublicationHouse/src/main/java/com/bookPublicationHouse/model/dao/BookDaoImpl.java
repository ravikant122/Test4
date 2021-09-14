package com.bookPublicationHouse.model.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bookPublicationHouse.model.dao.HibernateSessionFactory.HibernateSessionFactory;
import com.bookPublicationHouse.model.entities.Book;
import com.bookPublicationHouse.model.entities.Chapter;
import com.bookPublicationHouse.model.entities.Publisher;

public class BookDaoImpl implements BookDao{

	private SessionFactory sessionFactory;
	
    public BookDaoImpl() {
        sessionFactory = HibernateSessionFactory.getSessionFactory();
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
	
	@Override
	public void persistObjectGraph(Book book) {
		Session session = getSession();
		Transaction transaction = session.getTransaction();

        Publisher publisher = book.getPublisher();
        List<Chapter> chapters = book.getChapters();

        try {
            transaction.begin();

            session.save(book);
            session.save(publisher);
            session.save(chapters);

            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
	}

	@Override
	public Book retrieveObjectGraph(String isbn) {
		Session session = getSession();
        Transaction transaction = session.getTransaction();
        Book book = null;
        try {
            transaction.begin();

            book = session.get(Book.class, isbn);

            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return book;
    }

}
