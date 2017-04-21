package com.sw.thm.delegate;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sw.thm.model.PassengerTransportLicense;
import com.sw.thm.util.UnirestMapper;

import java.util.Arrays;
import java.util.List;


/**
 * Created by christophcaps on 11.04.17.
 */
public class PassengerTransportLicenseServiceDelegate implements PassengerTransportLicenseServiceInterface {

    private String baseURL ="http://license-service.dev.jonas-faber.me/license/transport";

    //Defaultkonstruktor
    public PassengerTransportLicenseServiceDelegate() {
        Unirest.setObjectMapper(new UnirestMapper());
    }

    //Konstruktor mit Connectionstring
    public PassengerTransportLicenseServiceDelegate(String targetURL) {
        Unirest.setObjectMapper(new UnirestMapper());
        baseURL = targetURL;
    }

    @Override
    public PassengerTransportLicense create(PassengerTransportLicense newLicense) {
        HttpResponse<PassengerTransportLicense> response = null;

        try {
            response = Unirest.post(baseURL)
                    .body(newLicense)
                    .asObject(PassengerTransportLicense.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response.getBody();

    }

    @Override
    public PassengerTransportLicense update(String id, PassengerTransportLicense newLicense) {
        HttpResponse<PassengerTransportLicense> response = null;

        try {
            response = Unirest.put(baseURL + "/"+ id)
                    .body(newLicense)
                    .asObject(PassengerTransportLicense.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response.getBody();

    }

    @Override
    public PassengerTransportLicense getByID(String id) {
        HttpResponse<PassengerTransportLicense> response = null;
        try {
            response = Unirest.get(baseURL + "/" + id).asObject(PassengerTransportLicense.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response.getBody();
    }

    @Override
    public List<PassengerTransportLicense> getAll() {
        HttpResponse<PassengerTransportLicense[]> response = null;
        try {
            response = Unirest.get(baseURL).asObject(PassengerTransportLicense[].class);
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
