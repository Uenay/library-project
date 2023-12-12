package ru.itgirl.libraryproject.Controller.Request;

public class ByIdRequest {
    private long id;
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
}
