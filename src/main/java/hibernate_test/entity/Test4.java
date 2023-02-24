package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            session.beginTransaction();

           /* Employee emp=session.get(Employee.class,1);
            emp.setSalary(1500);*/

           /* session.createQuery("update Employee set salary=1000"+
                    "where name='Игорь'").executeUpdate();*/


            session.createMutationQuery("update Employee set salary=1100"+
                    "where name='Игорь'").executeUpdate();


            session.getTransaction().commit();
            //System.out.println(emp);
            System.out.println("Done!");

        }

        finally {
            factory.close();
        }
    }
}
