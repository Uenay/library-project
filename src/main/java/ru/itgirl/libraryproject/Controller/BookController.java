package ru.itgirl.libraryproject.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.itgirl.libraryproject.Controller.Request.ByIdRequest;
import ru.itgirl.libraryproject.Controller.Request.SaveBookRequest;
import ru.itgirl.libraryproject.Controller.Request.UpdateBookRequest;
import ru.itgirl.libraryproject.Dto.AuthorDto;
import ru.itgirl.libraryproject.Dto.BookDto;
import ru.itgirl.libraryproject.Service.BookService;

import javax.swing.*;

@RestController
@RequiredArgsConstructor
public class BookController {
private final BookService bookService;
    @PostMapping("/book/save")
    public BookDto saveBook(@RequestBody SaveBookRequest saveBookRequest){
        return bookService.saveBook(saveBookRequest.getName(), saveBookRequest.getGenreId(), saveBookRequest.getAuthorsId());
    }

    @DeleteMapping("/book/delete")
    public void deleteAuthor(@RequestBody ByIdRequest byIdRequest){
    }

    @PutMapping("/book/update")
    public BookDto updateBook(@RequestBody UpdateBookRequest updateBookRequest){
        return null;
    }


}
