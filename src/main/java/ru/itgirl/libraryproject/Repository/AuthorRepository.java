package ru.itgirl.libraryproject.Repository;
import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.itgirl.libraryproject.Model.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>, JpaSpecificationExecutor<Author> {
    Author findAuthorByNameAndSurname(String name, String surname);

    @Query(nativeQuery = true, value = "SELECT * FROM AUTHOR WHERE name = ? AND SURNAME = ?")
    Author findAuthorByNameAndSurnameBySql(String name, String surname);


}
