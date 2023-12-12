package ru.itgirl.libraryproject.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.libraryproject.Controller.Request.ByIdRequest;
import ru.itgirl.libraryproject.Dto.GenreDto;
import ru.itgirl.libraryproject.Service.GenreService;

@RestController
@RequiredArgsConstructor
public class GenreController {
    private final GenreService genreService;

    @GetMapping("/getGenreById")
    GenreDto getGenreById(@RequestBody ByIdRequest getByIdRequest){
        return genreService.getGenreById(getByIdRequest.getId());
    }

}