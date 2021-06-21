package lt.codeacademy.spring.services;

import lt.codeacademy.spring.entities.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final MockService mockService;

    public CompanyService(MockService mockService){
        System.out.println("CompanyService");
        this.mockService = mockService;
    }

    public List<Company> getAll() {
        return mockService.getCompanies();
    }
}