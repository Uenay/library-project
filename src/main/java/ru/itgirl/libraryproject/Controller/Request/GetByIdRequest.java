package ru.itgirl.libraryproject.Controller.Request;

public class GetByIdRequest {
    private long id;
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
}
