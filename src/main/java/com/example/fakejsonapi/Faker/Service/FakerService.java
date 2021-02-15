package com.example.fakejsonapi.Faker.Service;
import com.example.fakejsonapi.Faker.Model.Address;
import com.example.fakejsonapi.Faker.Model.Book;
import com.example.fakejsonapi.Faker.Model.Person;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class FakerService {

    private Faker faker = new Faker(new Locale("en"));


    public List<Address> makeFakeAdress(int count) {

        List<Address> addressList = new ArrayList<Address>();

        for (int i=1; i <= count; i++) {

            String streetName = faker.address().streetName();
            String number = faker.address().buildingNumber();
            String city = faker.address().city();
            String postal = faker.address().zipCode();
            String fullAddress = faker.address().fullAddress();
            Address address = new Address(i, streetName, number, city, postal, fullAddress);
            addressList.add(address);

        }

        return addressList;

    }

    public List<Person> makeFakePerson(int count) {
        List<Person> personList = new ArrayList<Person>();

        for (int i=1; i <=count; i++) {
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();
            String fullName = faker.name().fullName();
            Person person = new Person(i, fullName, firstName, lastName);
            personList.add(person);
        }
        return personList;
    }

        public List<Book> makeFakeBook(int count) {
        List<Book> bookList = new ArrayList<Book>();

        for (int i=1; i <=count; i++) {
            String author = faker.book().author();
            String title = faker.book().title();
            String publisher = faker.book().publisher();
            String genre = faker.book().genre();
            Book book = new Book(i, author, title, publisher, genre);

            bookList.add(book);
        }
        return bookList;
    }


}
