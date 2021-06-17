package lt.codeacademy.spring.services;

import lt.codeacademy.spring.entities.Car;
import lt.codeacademy.spring.entities.Company;
import lt.codeacademy.spring.entities.GPS;
import lt.codeacademy.spring.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MockService {

    private List<Car> cars = new ArrayList<>();

    private List<Company> companies = new ArrayList<>();

    private List<User> users = new ArrayList<>();

    private List<GPS> gpsList = new ArrayList<>();

    public MockService() {
        Company company = new Company(1L,"Apple");
        User user = new User(1L,"Michael","Mock", 37,company);
        Car car = new Car(1L, "Toyota Avensis", 2010, user, company);
        GPS gps = new GPS(1L,"Nokia",company,car,45.7777777,65.7777777);

        companies.add(company);
        cars.add(car);
        users.add(user);
        gpsList.add(gps);

        car.setGps(gps);
        user.setCars(cars);
        company.setCars(cars);
        company.setUsers(users);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
