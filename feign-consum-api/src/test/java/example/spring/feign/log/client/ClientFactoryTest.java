package example.spring.feign.log.client;

import example.spring.feign.log.model.Book;
import example.spring.feign.log.model.BookResource;
import org.junit.Test;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ClientFactoryTest {
    private BookClient bookClient = ClientFactory.getBookClient();

    @Test
    public void getBookClient() {
        List<BookResource> books = bookClient.findAll();
        System.out.println(books.size());
    }

    @Test
    public void givenBookClient_shouldRunSuccessfully() throws Exception {
        List<Book> books = bookClient.findAll().stream()
                .map(BookResource::getBook)
                .collect(Collectors.toList());

        assertTrue(books.size() > 2);
    }

    @Test
    public void givenBookClient_shouldFindOneBook() throws Exception {
        Book book = bookClient.findByIsbn("0151072558").getBook();
        assertThat(book.getAuthor(), containsString("Orwell"));
    }

    @Test
    public void givenBookClient_shouldPostBook() throws Exception {
        String isbn = UUID.randomUUID().toString();
        Book book = new Book(isbn, "Me", "It's me!", null, null);
        bookClient.create(book);
        book = bookClient.findByIsbn(isbn).getBook();

        assertThat(book.getAuthor(), is("Me"));
    }
}