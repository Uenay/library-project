package ru.itgirl.libraryproject.Service;


import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.Query;
import ru.itgirl.libraryproject.Dto.AuthorDto;
import ru.itgirl.libraryproject.Model.Author;

public interface AuthorService {
    AuthorDto getAuthorById(Long id);
    AuthorDto getByNameSurnameV1(String name, String surname);


}