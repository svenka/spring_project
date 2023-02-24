package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            session.beginTransaction();

          /*  List<Employee> emps=session.createQuery(" from Employee "+
                    "where name='Игорь' + AND salary>600").getResultList();*/
            //Employee emp=session.get(Employee.class,1);

            List<Employee> emps = session.createSelectionQuery(
                    " from Employee "+
                            "where name='Игорь' + AND salary>600",
                    Employee.class)
                    .getResultList();



            for(Employee e:emps)
                System.out.println(e);
            //System.out.println(emp);
            session.getTransaction().commit();

            System.out.println("Done!");

        }

        finally {
            factory.close();
        }
    }
}
