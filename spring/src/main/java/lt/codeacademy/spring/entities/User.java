package lt.codeacademy.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class User {

    private Long id;

    private String firstName;

    private String lastName;

    private Integer age;

    private List<Car> cars;

    private Company company;

    public User(Long id, String firstName, String lastName, Integer age, Company company) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.company = company;
    }
}
