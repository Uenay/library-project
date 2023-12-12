package ru.itgirl.libraryproject.Controller.Request;

public class UpdateBookRequest extends SaveBookRequest{
    private Long id;
    public void setId(Long id){
        this.id = id;
    }
    Long getId(){
        return id;
    }
}
