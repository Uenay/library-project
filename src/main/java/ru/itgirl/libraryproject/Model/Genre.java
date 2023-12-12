package ru.itgirl.libraryproject.Model;

import jakarta.persistence.*;
import lombok.*;
import ru.itgirl.libraryproject.Model.Book;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
@Setter
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "genre")
    private Set<Book> books;
}