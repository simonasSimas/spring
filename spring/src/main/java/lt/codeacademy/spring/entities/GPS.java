package lt.codeacademy.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GPS {

    private Long id;

    private String model;

    private Company company;

    private Car car;

//    private Coordinate coordinate;

    private Double latitude;

    private Double longitude;
}
