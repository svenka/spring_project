package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(*  get*())")
    private void allGetMethods(){}


    //@Before("execution(public void aop.UniLibrary.getBook())")
    @Before("allGetMethods()")
    public  void beforeGetBookAdvice()
    {
        System.out.println("beforeGetBookAdvice:попытка получить книгу/журнал");
    }

    @Before("allGetMethods()")
    public  void beforeGetSecurityAdvice()
    {
        System.out.println("beforeGetSecurityAdvice:попытка проверки прав на книгу/журнал");
    }



}
