package lt.codeacademy.spring.services;

import lt.codeacademy.spring.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final MockService mockService;

    public UserService(MockService mockService){
        System.out.println("UserService");
        this.mockService = mockService;
    }

    public List<User> getAll() {

        return mockService.getUsers();
    }
}
