package ru.itgirl.libraryproject.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.itgirl.libraryproject.Controller.Request.SaveBookRequest;
import ru.itgirl.libraryproject.Controller.Request.UpdateBookRequest;
import ru.itgirl.libraryproject.Dto.AuthorDto;
import ru.itgirl.libraryproject.Dto.BookDto;
import ru.itgirl.libraryproject.Model.Author;
import ru.itgirl.libraryproject.Model.Book;
import ru.itgirl.libraryproject.Model.Genre;
import ru.itgirl.libraryproject.Repository.BookRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Component
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public BookDto saveBook(String name, Long genreId, Set<Long> authorsId) {
        Book book = new Book();
        book.setName(name);
        Genre genre = new Genre();
        genre.setId(genreId);
        book.setGenre(genre);
        Set<Author> authors = new HashSet<>();
        for (Long authorId : authorsId) {
            Author author = new Author();
            author.setId(authorId);
            authors.add(author);
        }
        book.setAuthors(authors);
        Book savedBook = bookRepository.save(book);
        return convertEntityToDto(savedBook);
    }
    private BookDto convertEntityToDto(Book book){
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setName(book.getName());
        bookDto.setGenre(book.getGenre().getName());//TODO: данные жанра не заполняются
        bookDto.setAuthor(book.getAuthors().toString());//TODO: BookDto должен принимать список авторов, а не одного
        return bookDto;
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public BookDto updateBook(UpdateBookRequest updateBookRequest) {
//        Book book = bookRepository.findById(updateBookRequest.getId()).orElseThrow();
//        book.setName(updateBookRequest.getName());
//        Genre genre = new Genre();
//        genre.setId(genre.getId());
//        book.setGenre(genre);
//        Set<Author> authors = new HashSet<>();
//        for (Long authorId : updateBookRequest.getAuthorsId()) {
//            Author author = new Author();
//            author.setId(authorId);
//            authors.add(author);
//        }
//        book.setAuthors(authors);
        return null;
    }
}
