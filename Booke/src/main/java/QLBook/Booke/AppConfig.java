package QLBook.Booke;

import QLBook.Booke.Entity.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setId(1L);
        book1.setTitle("Lập trình Web Spring MVC");
        book1.setAuthor("AUUUU");
        book1.setPrice(10.99);
        book1.setCategory("CNTT");
        books.add(book1);

        Book book2 = new Book();
        book2.setId(2L);
        book2.setTitle("Lập out trình");
        book2.setAuthor("AUUUU");
        book2.setPrice(10.99);
        book2.setCategory("CNTT");
        books.add(book2);

        Book book3 = new Book();
        book3.setId(3L);
        book3.setTitle("Sinh viên IT phiêu lưu ký");
        book3.setAuthor("STRING");
        book3.setPrice(6.11);
        book3.setCategory("NTR");
        books.add(book3);

        Book book4 = new Book();
        book4.setId(4L);
        book4.setTitle("Lập trình Web Spring MVC");
        book4.setAuthor("SIUUUU");
        book4.setPrice(10.99);
        book4.setCategory("PUB");
        books.add(book4);

        return books;
    }
}
