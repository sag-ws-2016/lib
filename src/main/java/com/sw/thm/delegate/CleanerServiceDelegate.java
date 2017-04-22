package com.sw.thm.delegate;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sw.thm.model.Cleaner;
import com.sw.thm.util.UnirestMapper;

import java.util.Arrays;
import java.util.List;


/**
 * Created by christophcaps on 11.04.17.
 */
public class CleanerServiceDelegate implements CleanerServiceInterface {

    private String baseURL ="http://cleaner-service.dev.jonas-faber.me/cleaner";

    //Defaultkonstruktor
    public CleanerServiceDelegate() {
        Unirest.setObjectMapper(new UnirestMapper());
    }

    //Konstruktor mit Connectionstring
    public CleanerServiceDelegate(String targetURL) {
        Unirest.setObjectMapper(new UnirestMapper());
        baseURL = targetURL;
    }

    @Override
    public Cleaner create(Cleaner newCleaner) {
        HttpResponse<Cleaner> response = null;

        try {
            response = Unirest.post(baseURL)
                    .body(newCleaner)
                    .asObject(Cleaner.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response.getBody();

    }

    @Override
    public Cleaner update(String id, Cleaner newCleaner) {
        HttpResponse<Cleaner> response = null;

        try {
            response = Unirest.put(baseURL + "/"+ id)
                    .body(newCleaner)
                    .asObject(Cleaner.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response.getBody();

    }

    @Override
    public Cleaner getByID(String id) {
        HttpResponse<Cleaner> response = null;
        try {
            response = Unirest.get(baseURL + "/" + id).asObject(Cleaner.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response.getBody();
    }

    @Override
    public List<Cleaner> getAll() {
        HttpResponse<Cleaner[]> response = null;
        try {
            response = Unirest.get(baseURL).asObject(Cleaner[].class);
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

    @Override
    public Cleaner startWork(String id) {
        HttpResponse<Cleaner> response = null;
        try {
            response = Unirest.post(baseURL + "/" + id + "/startWork").asObject(Cleaner.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response.getBody();
    }

    @Override
    public Cleaner finishWork(String id) {
        HttpResponse<Cleaner> response = null;
        try {
            response = Unirest.post(baseURL + "/" + id + "/finishWork").asObject(Cleaner.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response.getBody();
    }

    @Override
    public Cleaner restock(String id, int amount) {
        HttpResponse<Cleaner> response = null;
        try {
            response = Unirest.post(baseURL + "/" + id + "/restock/" + amount).asObject(Cleaner.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response.getBody();
    }
}
