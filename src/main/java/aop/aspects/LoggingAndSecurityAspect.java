package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAndSecurityAspect {

    //@Before("execution(public void aop.UniLibrary.getBook())")
    @Before("execution(*  get*())")
    public  void beforeGetBookAdvice()
    {
        System.out.println("beforeGetBookAdvice:попытка получить книгу/журнал");
    }

    @Before("execution(*  get*())")
    public  void beforeGetSecurityAdvice()
    {
        System.out.println("beforeGetSecurityAdvice:попытка проверки прав на книгу/журнал");
    }



}
