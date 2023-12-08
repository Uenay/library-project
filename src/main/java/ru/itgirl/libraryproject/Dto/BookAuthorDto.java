package ru.itgirl.libraryproject.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itgirl.libraryproject.Model.Genre;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BookAuthorDto {
    private Genre genre;
    private List<BookDto> books;
    private List<AuthorDto> authors;
}