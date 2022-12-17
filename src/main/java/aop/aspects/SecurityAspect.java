package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class SecurityAspect {

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public  void beforeAddSecurityAdvice()
    {
        System.out.println("beforeAddSecurityAdvice:попытка проверки прав на книгу/журнал");
        System.out.println("--------------------------------");
    }
}
