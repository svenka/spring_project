package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("${Book.name}")
    private String name;
    @Value("${Book.author}")
    private String author;
    @Value("${Book.yearOfPublication}")
    private int yearOfPublication;


    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getName() {
        return name;
    }
}
