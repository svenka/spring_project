package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(10)
public class LoggingAspect {




  /*  @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void AllMethodsFromUniLibrary(){}

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine()) ")
    private void returnMagazineFromUniLabrary(){}

    @Pointcut("AllMethodsFromUniLibrary() && !returnMagazineFromUniLabrary()")
    private void AllMethodsExceptReturnMagazineFromUniLibrary() { }

    @Before("AllMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice()
    {
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice:writing Log #10");
    }

*/



   /* @Pointcut("execution (* aop.UniLibrary.get*())")
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
    }*/







    //@Before("execution(public void aop.UniLibrary.getBook())")
    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public  void beforeGetBookAdvice()
    {
        System.out.println("beforeGetBookAdvice:логирование попытки получить книгу/журнал");
    }








}
