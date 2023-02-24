package hibernate_test2;


import hibernate_test2.Entity.Detail;
import hibernate_test2.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {



            session = factory.getCurrentSession();
            /*Employee employee=new Employee("Sergey","Bonn","IT",17000);
            Detail detail=new Detail("New-York","876-123-456","setgey@frecode.org");
            employee.setEmpDetail(detail);
            detail.setEmployee(employee);*/



            session.beginTransaction();
            //session.persist(detail);
           /* Detail detail=session.get(Detail.class,4);
            System.out.println(detail);
            System.out.println(detail.getEmployee());*/
            Detail detail=session.get(Detail.class,4);
            detail.getEmployee().setEmpDetail(null);

            session.remove(detail);



            session.getTransaction().commit();
            System.out.println("Done!");




        }

        finally {
            session.close();
            factory.close();
        }
    }
}
