package ru.itgirl.libraryproject.Service;

import ru.itgirl.libraryproject.Dto.GenreDto;

public interface GenreService {
    GenreDto getGenreById(Long id);
}