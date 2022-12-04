package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new
                ClassPathXmlApplicationContext("applicationContext3.xml");


        Dog myDog=context.getBean("dog",Dog.class);
//        Dog youDog=context.getBean("dog",Dog.class);
//        System.out.println("Переменные сслыаются на один и тот же объект?"+(myDog==youDog));
//        System.out.println(myDog);
//        System.out.println(youDog);
        myDog.say();

        context.close();


    }
}
