package example.spring.feign.log.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 16:05 2019/6/25.
 */
@Setter
@Getter
public class Book {
    private String isbn;
    private String author;
    private String title;
    private String synopsis;
    private String language;

    public Book() {
    }

    public Book(String isbn, String author, String title, String synopsis, String language) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.synopsis = synopsis;
        this.language = language;
    }
}