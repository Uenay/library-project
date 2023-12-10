package ru.itgirl.libraryproject.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.itgirl.libraryproject.Controller.Request.GetAuthorByNameSurnameRequest;
import ru.itgirl.libraryproject.Dto.AuthorDto;
import ru.itgirl.libraryproject.Service.AuthorService;

@RestController
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/getAuthorById")
    AuthorDto getAuthorById(@PathVariable("id") Long id) {
        return authorService.getAuthorById(id);
    }

//    @GetMapping("/author")
//    AuthorDto getAuthorByNameSurname(@RequestBody GetAuthorByNameSurnameRequest getAuthorByNameSurnameRequest ) {
//
//        return authorService.getByNameSurnameV1(getAuthorByNameSurnameRequest.getName(), getAuthorByNameSurnameRequest.getSurname());
//    }
//@GetMapping("/author")
//AuthorDto getByNameSurnameV1(@RequestParam("name") String name, @RequestParam("surname") String surname) {
//    return authorService.getByNameSurnameV1(name, surname);
//}
@GetMapping("/author")
AuthorDto getBookByNameV1(@RequestParam("name") String name, @RequestParam("surname") String surname) {
    return authorService.getByNameSurnameV1(name, surname);
}
}
