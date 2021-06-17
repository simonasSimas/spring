package lt.codeacademy.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Coordinate {

    private Long id;

    private Double latitude;

    private Double longitude;

    private LocalDateTime timeStamp;
}
