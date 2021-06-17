package lt.codeacademy.spring.services;

import lt.codeacademy.spring.entities.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private MockService mockService;

    public CompanyService(){
        System.out.println("CompanyService");
    }

    public List<Company> getAll() {
        return mockService.getCompanies();
    }
}