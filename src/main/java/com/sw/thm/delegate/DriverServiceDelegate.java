package com.sw.thm.delegate;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sw.thm.model.Driver;
import com.sw.thm.util.UnirestMapper;

import java.util.Arrays;
import java.util.List;


/**
 * Created by christophcaps on 11.04.17.
 */
public class DriverServiceDelegate implements DriverServiceInterface {

    private String baseURL ="http://driver-service.dev.jonas-faber.me/driver";

    //Defaultkonstruktor
    public DriverServiceDelegate() {
        Unirest.setObjectMapper(new UnirestMapper());
    }

    //Konstruktor mit Connectionstring
    public DriverServiceDelegate(String targetURL) {
        Unirest.setObjectMapper(new UnirestMapper());
        baseURL = targetURL;
    }

    @Override
    public Driver create(Driver newDriver) {
        HttpResponse<Driver> response = null;

        try {
            response = Unirest.post(baseURL)
                    .body(newDriver)
                    .asObject(Driver.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response.getBody();

    }

    @Override
    public Driver update(String id, Driver newDriver) {
        HttpResponse<Driver> response = null;

        try {
            response = Unirest.put(baseURL + "/"+ id)
                    .body(newDriver)
                    .asObject(Driver.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response.getBody();

    }

    @Override
    public Driver getByID(String id) {
        HttpResponse<Driver> response = null;
        try {
            response = Unirest.get(baseURL + "/" + id).asObject(Driver.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response.getBody();
    }

    @Override
    public List<Driver> getAll() {
        HttpResponse<Driver[]> response = null;
        try {
            response = Unirest.get(baseURL).asObject(Driver[].class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return Arrays.asList(response.getBody());
    }

    @Override
    public void delete(String id) {

        try {
            HttpResponse<JsonNode> response = Unirest.delete(baseURL + "/" + id).asJson();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
}
