package ru.itgirl.libraryproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itgirl.libraryproject.Model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findBookByGenreAndAuthorsAndName(String genre, String authors, String name);
}
