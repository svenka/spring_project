package hibernate_test2;


import hibernate_test2.Entity.Detail;
import hibernate_test2.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
            /*session = factory.getCurrentSession();
            //Employee emp = new Employee("Игорь", "Владимиров", "IT", 700);
            Employee employee=new Employee("Ivan","Ivanovich","HR",7000);
            Detail detail=new Detail("Baku","123-123-456","ivanovif@frecode.org");
            employee.setEmpDetail(detail);
            session.beginTransaction();
            session.persist(employee);
            //session.persist(emp);
            session.getTransaction().commit();
            //System.out.println(emp);
            System.out.println("Done!");*/

            /*session = factory.getCurrentSession();
            Employee employee=new Employee("Oleg","Smirnov","Sales",5000);
            Detail detail=new Detail("Moscow","555-555-456","olezhka@gmail.org");
            employee.setEmpDetail(detail);
            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();
            System.out.println("Done!");*/


            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp=session.get(Employee.class,1);
            session.remove(emp);
            //System.out.println(emp.getEmpDetail());

            session.getTransaction().commit();
            System.out.println("Done!");




        }

        finally {
            session.close();
            factory.close();
        }
    }
}
