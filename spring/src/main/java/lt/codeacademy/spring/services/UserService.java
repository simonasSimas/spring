package lt.codeacademy.spring.services;

import lt.codeacademy.spring.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private MockService mockService;

    public UserService(){
        System.out.println("UserService");
    }

    public List<User> getAll() {
        return mockService.getUsers();
    }
}
