package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            session.beginTransaction();

            /*Employee emp=session.get(Employee.class,6);
            session.remove(emp);
            */

            session.createMutationQuery("delete Employee "+
                    "where name='Касуга'").executeUpdate();

            session.getTransaction().commit();
            //System.out.println(emp);
            System.out.println("Done!");

        }

        finally {
            factory.close();
        }
    }
}
