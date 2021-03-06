package design.pattern.test.behavior_patterns.chain_of_responsibility.model;

import design.pattern.test.behavior_patterns.chain_of_responsibility.anotations.IntegerValue;
import design.pattern.test.behavior_patterns.chain_of_responsibility.anotations.StringValue;

public class User {

    @IntegerValue(1)
    private int id;

    @StringValue("Tomas")
    private String name;

    @StringValue("Walter")
    private String surname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
