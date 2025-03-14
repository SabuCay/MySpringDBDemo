package com.example.myspringdbdemo.Service;

import com.example.myspringdbdemo.Model.Person;
import com.example.myspringdbdemo.Repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepo personRepo;

    public List<Person> fetchAll(){
        return personRepo.fetchAll();
    }

    public void addPerson(Person p){
        personRepo.addPerson(p);
    }

    public Person findPersonById(int id){
        return personRepo.findPersonById(id);
    }

    public Boolean deletePerson(int id){
        return personRepo.deletePerson(id);
    }

    public void updatePerson(Person p){
        personRepo.updatePerson(p);
    }
}
