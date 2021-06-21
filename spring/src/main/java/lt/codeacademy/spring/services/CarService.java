package lt.codeacademy.spring.services;

import lt.codeacademy.spring.entities.Car;
import lt.codeacademy.spring.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CarService {

    private final MockService mockService;

    private final DateUtil dateUtil;

    public CarService(MockService mockService, DateUtil dateUtil) {
        this.mockService = mockService;
        this.dateUtil = dateUtil;
        test();
    }

    public void test() {
        System.out.println(dateUtil.format(LocalDate.of(2000,1,1)));
    }

    public List<Car> getAll(){
        return mockService.getCars();
    }
}