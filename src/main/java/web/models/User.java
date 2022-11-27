package web.models;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {

    private Long id;

    @NotEmpty(message = "Not empty!")
    @Size(min = 3, max = 20, message = "Name should be between 3 and 20 chars")
    private String name;

    @NotEmpty(message = "Not empty!")
    @Size(min = 3, max = 20, message = "Name should be between 3 and 20 chars")
    private String lastName;

    @Min(value = 0, message = "Should be 0 or more")
    @Max(value = 99, message = "Should be 99 or less")
    private Byte age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public User() {

    }

    public User(Long id, String name, String lastName, Byte age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }
}