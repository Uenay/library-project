package ru.itgirl.libraryproject.Service;

import org.springframework.stereotype.Component;
import ru.itgirl.libraryproject.Controller.Request.SaveBookRequest;
import ru.itgirl.libraryproject.Controller.Request.UpdateBookRequest;
import ru.itgirl.libraryproject.Dto.BookDto;

import java.util.Set;
public interface BookService {
    BookDto saveBook(String name, Long genreId, Set<Long> authorsId);

    void deleteBook(Long id);
    BookDto updateBook(UpdateBookRequest updateBookRequest);
}