package ru.itgirl.libraryproject.Controller.Request;

import lombok.*;
import ru.itgirl.libraryproject.Model.Author;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SaveBookRequest {

    private String name;
    private Long genreId;
    private Set<Long> authorsId;
    public void setName(String name){
        this.name = name;
    }

    public void setGenreId(Long genreId){
        this.genreId = genreId;
    }

    public void setAuthorsId(Set<Long> authorsId){
        this.authorsId = authorsId;
    }
    public String getName(){
        return name;
    }

    public Long getGenreId(){
        return genreId;
    }

    public Set<Long> getAuthorsId(){
        return  authorsId;
    }

}
