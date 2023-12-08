package ru.itgirl.libraryproject.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itgirl.libraryproject.Dto.BookDto;
import ru.itgirl.libraryproject.Dto.GenreDto;
import ru.itgirl.libraryproject.Model.Genre;
import ru.itgirl.libraryproject.Repository.GenreRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GenreServiceImpl implements GenreService {
    private final GenreRepository genreRepository;
    GenreServiceImpl(GenreRepository genreRepository){
        this.genreRepository = genreRepository;
    }

    @Override
    public GenreDto getGenreById(Long id) {
        Genre genre = genreRepository.findById(id).orElseThrow();
        return convertToDto(genre);
    }

    private GenreDto convertToDto(Genre genre) {
        List<BookDto> bookDtoList = genre.getBooks()
                .stream()
                .map(book -> BookDto.builder()
                        .name(book.getName())
                        .id(book.getId())
////                        //.author(book.getAuthors()
////                                .stream()
////                                .map(author -> {
////                                    String an = author.getName();
////                                    String as = author.getSurname();
////                                    return an + " " + as;
//                                }).collect(Collectors.joining()))
                        .build()
                ).toList();
        return GenreDto.builder()
                .books(bookDtoList)
                .id(genre.getId())
                .name(genre.getName())
                .build();
    }
}