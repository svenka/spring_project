package hibernate_one_to_many_bi;



import hibernate_one_to_many_bi.Entity.Department;
import hibernate_one_to_many_bi.Entity.Employee;
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
            Department dep=new Department("SALES",800,1500);
            Employee emp1=new Employee("Genry","Tregulov",800);
            Employee emp2=new Employee("Mark","Smirnovich",1500);
            Employee emp3=new Employee("Anna","Smolkin",1200);
            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);
            dep.addEmployeeToDepartment(emp3);
            session.beginTransaction();
            session.persist(dep);
            session.getTransaction().commit();
            //System.out.println(emp);
            System.out.println("Done!");

        }*/
/*-------------------------------------------------------------------*/
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            System.out.println("get department");
            Department department=session.get(Department.class,5);
            System.out.println("show department");
            System.out.println(department);

            System.out.println("Подгрузим наших работников");
            department.getEmps().get(0);

            session.getTransaction().commit();

            System.out.println("show employees of department");
            System.out.println(department.getEmps());
            System.out.println("Done!");
        }
/*-------------------------------------------------------------------*/
     /*   try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp=session.get(Employee.class,4);
            System.out.println(emp);
            System.out.println(emp.getDepartment());

            session.getTransaction().commit();
            System.out.println("Done!");
        }*/
/*-------------------------------------------------------------------*/
    /*    try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp=session.get(Employee.class,4);
            session.remove(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        }*/

        finally {
            session.close();
            factory.close();
        }
    }
}
