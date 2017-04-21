package com.sw.thm.delegate;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sw.thm.model.DrivingLicense;
import com.sw.thm.util.UnirestMapper;

import java.util.Arrays;
import java.util.List;


/**
 * Created by christophcaps on 11.04.17.
 */
public class DrivingLicenseServiceDelegate implements DrivingLicenseServiceInterface {

    private String baseURL ="http://license-service.dev.jonas-faber.me/license/driving";

    //Defaultkonstruktor
    public DrivingLicenseServiceDelegate() {
        Unirest.setObjectMapper(new UnirestMapper());
    }

    //Konstruktor mit Connectionstring
    public DrivingLicenseServiceDelegate(String targetURL) {
        Unirest.setObjectMapper(new UnirestMapper());
        baseURL = targetURL;
    }

    @Override
    public DrivingLicense create(DrivingLicense newLicense) {
        HttpResponse<DrivingLicense> response = null;

        try {
            response = Unirest.post(baseURL)
                    .body(newLicense)
                    .asObject(DrivingLicense.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response.getBody();

    }

    @Override
    public DrivingLicense update(String id, DrivingLicense newLicense) {
        HttpResponse<DrivingLicense> response = null;

        try {
            response = Unirest.put(baseURL + "/"+ id)
                    .body(newLicense)
                    .asObject(DrivingLicense.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response.getBody();

    }

    @Override
    public DrivingLicense getByID(String id) {
        HttpResponse<DrivingLicense> response = null;
        try {
            response = Unirest.get(baseURL + "/" + id).asObject(DrivingLicense.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response.getBody();
    }

    @Override
    public List<DrivingLicense> getAll() {
        HttpResponse<DrivingLicense[]> response = null;
        try {
            response = Unirest.get(baseURL).asObject(DrivingLicense[].class);
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
