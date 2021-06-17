package lt.codeacademy.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

    private Long id;

    private String model;

    private Integer year;

    private User user;

    private Company company;

    private GPS gps;

    public Car(Long id, String model, Integer year, User user, Company company) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.user = user;
        this.company = company;
    }
}