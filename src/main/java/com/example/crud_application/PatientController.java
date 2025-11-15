package com.example.crud_application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @Autowired
    PatientRepository repo;

    public PatientController(PatientRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/patients")
    public Patient create(@RequestBody Patient e) {
        return repo.save(e);
    }

    @GetMapping("/patients")
    public List<Patient> getAll() {
        return repo.findAll();
    }

    @DeleteMapping("/patients/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }

}
