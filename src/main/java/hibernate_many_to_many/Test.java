package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) {
        SessionFactory factory=new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session=null;
        try{
            /*session=factory.getCurrentSession();
            Section section1=new Section("Football");
            Child child1=new Child("Ivan",7);
            Child child2=new Child("Zaur",5);
            Child child3=new Child("Katya",6);
            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.beginTransaction();


            session.persist(section1);
            session.getTransaction().commit();
            System.out.println("Done");*/
            /********************************/

            /*session=factory.getCurrentSession();
            Section section1=new Section("VolleyBall");
            Section section2=new Section("Chess");
            Section section3=new Section("Math");
            Child child4=new Child("Sasha",10);

            child4.addSectionToChild(section1);
            child4.addSectionToChild(section2);
            child4.addSectionToChild(section3);

           *//* section1.addChildToSection(child4);
            section2.addChildToSection(child4);
            section3.addChildToSection(child4);*//*

            session.beginTransaction();


            session.persist(child4);

            session.getTransaction().commit();
            System.out.println("Done");*/
            /*************************/
            /*session=factory.getCurrentSession();

            session.beginTransaction();

            Section section=session.get(Section.class,1);
            System.out.println(section);
            System.out.println(section.getChildren());
            session.getTransaction().commit();
            System.out.println("Done");*/
            /*************************/
            session=factory.getCurrentSession();

            session.beginTransaction();

            Child child=session.get(Child.class,5);
            System.out.println(child);
            System.out.println(child.getSections());
            session.getTransaction().commit();
            System.out.println("Done");
        }
        finally {
            session.close();
            factory.close();

        }
    }
}
