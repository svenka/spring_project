package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class UniversityLoggingAspect {


    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice:логируем получение " +
                "списка студентов перед методом getStudents()");
    }


/*    @AfterReturning(pointcut = "execution(* getStudents())",
            returning = "students")
    public void AfterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student first = students.get(0);
        String nameSurname = first.getNameSurname();
        nameSurname = "Mr." + nameSurname;
        first.setNameSurname(nameSurname);
        double avgGrade = first.getAvgGrade();
        avgGrade = avgGrade + 1;
        first.setAvgGrade(avgGrade);

        System.out.println("AfterReturningGetStudentsLoggingAdvice:логируем получение " +
                "списка студентов после успешного завершения работы метода getStudents()");
    }*/

/*
    @AfterThrowing(pointcut = "execution(* getStudents())",throwing = "exception")
    public void AfterThrowingGetStudentsLoggingAdvice(Throwable exception)
    {
        System.out.println("AfterThrowingGetStudentsLoggingAdvice:логируем выброс исключения "+exception);
    }
*/


    @After("execution (* getStudents())")
    public void AfterGetStudentsLoggingAdvice()
    {
        System.out.println("AfterGetStudentsLoggingAdvice логируем нормальное окончание работы метода или выброс исключения");
    }
}
