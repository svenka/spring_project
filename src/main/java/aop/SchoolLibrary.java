package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstarctLibrary{

    public void getBook() {
        System.out.println("Мы берем книгу из SchoolLibrary");
    }
}
