package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    //@Before("execution(public void aop.UniLibrary.getBook())")
    @Before("execution(public void getBook(aop.Book,..))")
    public  void beforeGetBookAdvice()
    {
        System.out.println("beforeGetBookAdvice:попытка получить книгу");
    }


    @Before("execution(public * returnBook())")
    public  void returnBookAdvice()
    {
        System.out.println("returnBookAdvice:попытка вернуть книгу");
    }


}
