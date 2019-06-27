package example.spring.feign.log.client;

import example.spring.feign.log.model.Book;
import example.spring.feign.log.model.BookResource;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description: NOTE: Feign clients can be used to consume text-based HTTP APIs only,
 * which means that they cannot handle binary data, e.g. file uploads or downloads.
 * @Date: Created at 16:11 2019/6/25.
 */
public interface BookClient {
    @RequestLine("GET /{isbn}")
    BookResource findByIsbn(@Param("isbn") String isbn);

    @RequestLine("GET")
    List<BookResource> findAll();

    @RequestLine("POST")
    @Headers("Content-Type: application/json")
    void create(Book book);

    @RequestLine("POST /soms/orderservice/order")
    void creatOrder(Object order);
}