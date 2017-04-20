package com.sw.thm.delegate;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sw.thm.model.Driver;
import com.sw.thm.util.ObjectMapper;
import com.sw.thm.util.UnirestMapper;

import java.util.Arrays;
import java.util.List;


/**
 * Created by christophcaps on 11.04.17.
 */
public class DriverServiceDelegate implements DriverServiceInterface {

    private String baseURL ="http://localhost:4567/driver";
    private ObjectMapper objectMapper = new ObjectMapper();


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
    public void create(Driver newDriver) {

        try {
            HttpResponse<JsonNode> response = Unirest.post(baseURL).body(newDriver).asJson();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(String id, Driver newDriver) {
        try {
            HttpResponse<JsonNode> response = Unirest.put(baseURL + "/"+ id).body(newDriver).asJson();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
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
