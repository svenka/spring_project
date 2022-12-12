package aop;


import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstarctLibrary{


    public void getBook(Book book)
    {
        System.out.println("Мы берем книгу из UniLibrary:"+book.getName());
    }

    public void returnBook(){System.out.println("Мы возвращаем книгу из UniLibrary");}

    public void getMagazine()
    {
        System.out.println("Мы берем журнал из UniLibrary");
    }
}
