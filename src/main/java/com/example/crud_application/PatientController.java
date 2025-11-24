package com.example.crud_application;
import com.example.crud_application.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;  
@RestController
public class PatientController{
    @Autowired
    private PatientRepository repo;
    public PatientController(PatientRepository repo){
        this.repo=repo;
    }

    @PostMapping("/patients")
    public Patient create(@RequestBody Patient e){
        return repo.save(e);
    }

    @GetMappping("/patients")
    public List<Patient> getAll(){
        return repo.findAll();  
    }

    @DeleteMapping("/patients/{id}")
    public void delete(@PathVariable Long id){
        repo.deleteById(id);
    }
}