package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class ExceptionHandlingAspect {

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice()
    {
        System.out.println("beforeAddExceptionHandlingAdvice:обрабатываем исключение при попытке получить книгу/журнал");
        System.out.println("--------------------------------");
    }
}
