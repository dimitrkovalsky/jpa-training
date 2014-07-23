import common.DaoFactory;
import dao.IBookDao;
import exception.DaoException;
import models.Book;

/**
 * @author Antonio Goncalves
 *         APress models.Book - Beginning Java EE 7 with Glassfish 4
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
public class Main {

    public static void main(String[] args) throws DaoException {
        Book book = new Book();
        book.setId(1L);
        //Book book2 = new Book("Some fdata", "Interst book", 12.5F, "1-844223-455-2", 88, false);
        IBookDao dao = DaoFactory.getBookDao();
        book = dao.find(book);

        book.setIllustrations(true);

        dao.delete(book);
//        for(Book b : dao.findAll())
//            System.out.println(b);
        //dao.update(book);
      //  dao.insert(book2);

    }
}