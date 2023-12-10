package ru.itgirl.libraryproject.Service;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import ru.itgirl.libraryproject.Model.Author;
import ru.itgirl.libraryproject.Repository.AuthorRepository;
import ru.itgirl.libraryproject.Dto.AuthorDto;
import ru.itgirl.libraryproject.Dto.BookDto;

import java.util.List;

@Service

public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorDto getAuthorById(Long id) {
        Author author = authorRepository.findById(id).orElseThrow();
        return convertEntityToDto(author);
    }

//    @Override
//    public AuthorDto getByNameSurnameV1(String name, String surname) {
//        Author author = authorRepository.findAuthorByNameAndSurnameBySql(name, surname);
//        return convertEntityToDto(author);
//    }
    @Override
    public AuthorDto getByNameSurnameV1(String name, String surname) {
        Specification<Author> specification = Specification.where(new Specification<Author>() {
            @Override
            public Predicate toPredicate(Root<Author> root,
                                         CriteriaQuery<?> query,
                                         CriteriaBuilder cb) {
                return cb.and(cb.equal(root.get("name"), name), cb.equal(root.get("surname"), surname));
            }
        });

        Author author = authorRepository.findOne(specification).orElseThrow();
        return convertEntityToDto(author);
    }

//    @Override
//    public AuthorDto getByNameSurnameV1(String name, String surname) {
//        Author author = authorRepository.findAuthorByNameAndSurname(name, surname);
//        return convertEntityToDto(author);
//    }

    private AuthorDto convertEntityToDto(Author author) {
        List<BookDto> bookDtoList = author.getBooks()
                .stream()
                .map(book -> BookDto.builder()
                        .genre(book.getGenre().getName())
                        .name(book.getName())
                        .id(book.getId())
                        .build()
                ).toList();
        return AuthorDto.builder()
                .books(bookDtoList)
                .id(author.getId())
                .name(author.getName())
                .surname(author.getSurname())
                .build();
    }

}
