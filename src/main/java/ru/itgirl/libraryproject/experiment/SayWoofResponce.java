package ru.itgirl.libraryproject.experiment;

public class SayWoofResponce {
    private String message;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getAge() {
        return age;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "SayWoofResponce{" +
                "message='" + message + '\'' +
                ", age=" + age +
                '}';
    }
}
