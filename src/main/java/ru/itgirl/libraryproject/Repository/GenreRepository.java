package ru.itgirl.libraryproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itgirl.libraryproject.Model.Genre;
@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}