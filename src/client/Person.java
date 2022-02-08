package client;

public class Person {
    private String name;
    private String document;

    public Person(String document, String name){
        this.document = document;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }
}
