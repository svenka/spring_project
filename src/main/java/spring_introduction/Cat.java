package spring_introduction;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{


    public Cat() {
        System.out.println("Cat is created");
    }

    @Override
    public void say() {
        System.out.println("meow-meow");
    }
}
