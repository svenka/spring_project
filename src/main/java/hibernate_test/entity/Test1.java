package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Игорь", "Владимиров", "IT", 700);
            session.beginTransaction();
            session.persist(emp);
            session.getTransaction().commit();
            System.out.println(emp);
            System.out.println("Done!");

        }

        finally {
            factory.close();
        }
    }
}
