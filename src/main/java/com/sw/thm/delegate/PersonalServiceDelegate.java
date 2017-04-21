package com.sw.thm.delegate;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sw.thm.model.Contract;
import com.sw.thm.model.Person;
import com.sw.thm.util.UnirestMapper;
import javassist.NotFoundException;

import java.util.Arrays;
import java.util.List;

/**
 * Created by christophcaps on 21.04.17.
 */
public class PersonalServiceDelegate implements PersonalServiceInterface {

    private String baseURL ="http://personal-service.dev.jonas-faber.me/personal";

    //Defaultkonstruktor
    public PersonalServiceDelegate() {
        Unirest.setObjectMapper(new UnirestMapper());
    }

    //Konstruktor mit Connectionstring
    public PersonalServiceDelegate(String targetURL) {
        Unirest.setObjectMapper(new UnirestMapper());
        baseURL = targetURL;
    }


    @Override
    public Person getByID(String id) throws NotFoundException {
        HttpResponse<Person> response = null;
        try {
            response = Unirest.get(baseURL + "/" + id).asObject(Person.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response.getBody();
    }

    @Override
    public List<Person> getAll() {
        HttpResponse<Person[]> response = null;
        try {
            response = Unirest.get(baseURL).asObject(Person[].class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return Arrays.asList(response.getBody());
    }
}
