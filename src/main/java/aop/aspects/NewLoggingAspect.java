package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution (public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {


        System.out.println("aroundReturnBookLoggingAdvice:в библиотеку пытаются вернуть  книгу");
        long start = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        //targetMethodResult="Старик и море";
        long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice:в библиотеку успешно вернули  книгу");
        System.out.println("aroundReturnBookLoggingAdvice:Метод returnBook() сработал за=" + (end - start) + " миллисекунд");
        return targetMethodResult;

    }


    @Around("execution (public String returnMagazine())")
    public Object aroundReturnMagazineLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice:в библиотеку пытаются вернуть журнал");
        Object targetMethodResult=null;
        try{
        targetMethodResult = proceedingJoinPoint.proceed();}
        catch (Exception e)
        {
            System.out.println("aroundReturnMagazineLoggingAdvice Логируем пойманное инсключение targetMethodResult="+e);
            //targetMethodResult="Неизвестный журнал";
            throw  e;
        }
        System.out.println("aroundReturnBookLoggingAdvice:в библиотеку успешно вернули  журнал");
        return targetMethodResult;



    }





}
