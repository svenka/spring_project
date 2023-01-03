package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        System.out.println("Начало запуска метода main");
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library=context.getBean("uniLibrary",UniLibrary.class);
        String book=library.returnBook();
        System.out.println("Вы вернули в библиотеку книгу "+book);


        context.close();
        System.out.println("Окончание работы метода main");
    }
}
