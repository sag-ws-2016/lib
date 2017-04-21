package com.sw.thm.delegate;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sw.thm.model.Personal;
import com.sw.thm.util.UnirestMapper;
import javassist.NotFoundException;

import java.util.Arrays;
import java.util.List;

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
    public Personal getByID(String id) throws NotFoundException {
        HttpResponse<Personal> response = null;
        try {
            response = Unirest.get(baseURL + "/" + id).asObject(Personal.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response.getBody();
    }

    @Override
    public List<Personal> getAll() {
        HttpResponse<Personal[]> response = null;
        try {
            response = Unirest.get(baseURL).asObject(Personal[].class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return Arrays.asList(response.getBody());
    }
}
