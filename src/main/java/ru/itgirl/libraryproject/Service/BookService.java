package ru.itgirl.libraryproject.Service;

import ru.itgirl.libraryproject.Dto.BookDto;

public interface BookService {
    BookDto getBookByIdGenre(Long id);
}