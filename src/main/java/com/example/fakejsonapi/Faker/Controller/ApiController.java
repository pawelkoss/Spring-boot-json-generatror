package com.example.fakejsonapi.Faker.Controller;

import com.example.fakejsonapi.Faker.Model.Address;
import com.example.fakejsonapi.Faker.Model.Book;
import com.example.fakejsonapi.Faker.Model.Person;
import com.example.fakejsonapi.Faker.Service.FakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ApiController {

    @Autowired
    private FakerService fakerService;


    @GetMapping(path = "/api/address/{count}")
    public List<Address> fakeAddress(@PathVariable("count") int count){

        return fakerService.makeFakeAdress(count);
    }

    @GetMapping(path = "/api/person/{count}")
    public List<Person> fakePerson(@PathVariable("count") int count){

        return fakerService.makeFakePerson(count);
    }
    @GetMapping(path = "/api/book/{count}")
    public List<Book> fakeBook(@PathVariable("count") int count){
        return fakerService.makeFakeBook(count);
    }
}
