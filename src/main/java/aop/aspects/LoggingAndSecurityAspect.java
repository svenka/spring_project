package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution (* aop.UniLibrary.get*())")
        private void AllGetMethodsFromUnLibrary() {}

    @Before("AllGetMethodsFromUnLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice:writing Log #1");
    }

    @Pointcut("execution (* aop.UniLibrary.return*())")
    private void AllReturnMethodsFromUnLibrary() {}

    @Before("AllReturnMethodsFromUnLibrary()")
    public void beforeReturnLoggingAdvice()
    {
        System.out.println("beforeReturnLoggingAdvice:writing Log #2");
    }


    @Pointcut("AllGetMethodsFromUnLibrary() || AllReturnMethodsFromUnLibrary()")
    private  void AllGetAndReturnMethodsFromUnLibrary(){}

    @Before("AllGetAndReturnMethodsFromUnLibrary()")
    public void beforeGetAndReturnLoggingAdvice()
    {
        System.out.println("beforeGetAndReturnLoggingAdvice:writing Log #3");
    }













  /*  @Pointcut("execution(*  get*())")
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

*/




}
