package lt.codeacademy.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Company {

    private Long id;

    private String name;

    private List<Car> cars;

    private List<User> users;

    private List<GPS> gpsList;

    public Company(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
