package common;

import dao.BookDao;
import dao.IBookDao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by Dmytro_Kovalskyi on 23.07.2014.
 */
public class DaoFactory {
    private static String PERSISTENT_UNIT = "chapter04PU";
    private static EntityManager em = Persistence.createEntityManagerFactory(PERSISTENT_UNIT).createEntityManager();

    public static IBookDao getBookDao() {
        return new BookDao(em);
    }
}
