package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component

public class MyPointcuts {

    @Pointcut("execution(*  get*())")
    public void allGetMethods(){}
}
