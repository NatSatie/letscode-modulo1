package sketch.client.person;

public class Person {
    private String name;
    private String document;
    private PersonType personType;

    public Person(String name, String document, PersonType personType){
        this.name = name;
        this.document = document;
        this.personType = personType;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public PersonType getPersonType() {
        return personType;
    }
}
