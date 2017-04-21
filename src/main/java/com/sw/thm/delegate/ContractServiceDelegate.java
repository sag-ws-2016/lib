package com.sw.thm.delegate;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sw.thm.model.Contract;
import com.sw.thm.util.UnirestMapper;
import javassist.NotFoundException;

import java.util.Arrays;
import java.util.List;

/**
 * Created by christophcaps on 01.04.17.
 */
public class ContractServiceDelegate implements ContractServiceInterface {

    private String baseURL ="http://contract-service.dev.jonas-faber.me/contract";

    //Defaultkonstruktor
    public ContractServiceDelegate() {
        Unirest.setObjectMapper(new UnirestMapper());
    }

    //Konstruktor mit Connectionstring
    public ContractServiceDelegate(String targetURL) {
        Unirest.setObjectMapper(new UnirestMapper());
        baseURL = targetURL;
    }


    @Override
    public Contract create(Contract contract) throws NotFoundException {
        HttpResponse<Contract> response = null;

        try {
            response = Unirest.post(baseURL)
                    .body(contract)
                    .asObject(Contract.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response.getBody();
    }

    @Override
    public Contract update(String id, Contract contract) throws NotFoundException {
        HttpResponse<Contract> response = null;

        try {
            response = Unirest.put(baseURL + "/"+ id)
                    .body(contract)
                    .asObject(Contract.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response.getBody();
    }

    @Override
    public Contract getByID(String id) throws NotFoundException {
        HttpResponse<Contract> response = null;
        try {
            response = Unirest.get(baseURL + "/" + id).asObject(Contract.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response.getBody();
    }

    @Override
    public List<Contract> getAll() {
        HttpResponse<Contract[]> response = null;
        try {
            response = Unirest.get(baseURL).asObject(Contract[].class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return Arrays.asList(response.getBody());
    }

    @Override
    public void delete(String id) throws NotFoundException {
        try {
            HttpResponse<JsonNode> response = Unirest.delete(baseURL + "/" + id).asJson();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
}
