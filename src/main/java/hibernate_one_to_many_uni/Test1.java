package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.Entity.Department;
import hibernate_one_to_many_uni.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        /*try {
            session = factory.getCurrentSession();
            Department dep=new Department("HR",10000,1200);
            Employee emp1=new Employee("Ivan","Trepupkin",800);
            Employee emp2=new Employee("Olga","Pervch",500);
            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);
            session.beginTransaction();
            session.persist(dep);
            session.getTransaction().commit();

            System.out.println("Done!");

        }*/

      /*  try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Department department=session.get(Department.class,4);
            System.out.println(department);
            System.out.println(department.getEmps());
            session.getTransaction().commit();
            System.out.println("Done!");
        }*/

     /*   try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp=session.get(Employee.class,5);
            System.out.println(emp);
            //System.out.println(emp.getDepartment());

            session.getTransaction().commit();
            System.out.println("Done!");
        }*/
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Department department=session.get(Department.class,4);
            session.remove(department);

            session.getTransaction().commit();
            System.out.println("Done! department");
        }

        finally {
            session.close();
            factory.close();
        }
    }
}
