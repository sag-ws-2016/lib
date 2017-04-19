package com.sw.thm.delegate;

import com.fasterxml.jackson.core.JsonParseException;
import com.sw.thm.model.Driver;
import com.sw.thm.util.ObjectMapper;
import net.sf.corn.httpclient.HttpClient;
import net.sf.corn.httpclient.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by christophcaps on 11.04.17.
 */
public class DriverServiceDelegate implements DriverServiceInterface {

    //TODO: INSTANZ VON DELEGATE UND DANN get aufrufen

    private String baseURL ="http://localhost:4567/driver";
    private ObjectMapper objectMapper = new ObjectMapper();
    //Konstruktor mit Connectionstring
    public DriverServiceDelegate(String targetURL) {
        baseURL = targetURL;
    }

    //DEFAULT
    public DriverServiceDelegate() {
    }

    @Override
    public void create(Driver driver) {
        HttpClient client = null;
        try {
            client = new HttpClient(new URI(baseURL));


            Driver newDriver = driver;
            //TODO map driver object to json
            newDriver = objectMapper.dataToJson(newDriver, json);
            //TODO send driver to server with put

            HttpResponse request = null;
            request = client.sendData(HttpClient.HTTP_METHOD.PUT);
        }
        catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        System.out.println("POST + URL + Driver");
    }

    @Override
    public void update(String id, Driver newDriver) {
        System.out.println("Update driver an mit der ID: id");
    }

    @Override
    public Driver getByID(String id) {
        Driver driver = new Driver();

        HttpClient client = null;
        try {
            client = new HttpClient(new URI(baseURL + "/" + id));

        // Basic Authentication
        //client.setCredentials("user1", "password");
        HttpResponse response = null;
            response = client.sendData(HttpClient.HTTP_METHOD.GET);
            System.out.println(response.getData());
            driver = objectMapper.readValue(response.getData(), Driver.class);

        }catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        System.out.println("Request an Server mit ID");
        System.out.println("get JSON");
        System.out.println("mapped in Object ");
        System.out.println("return driver ");
        return driver;
    }

    @Override
    public List<Driver> getAll() {
        System.out.println("Get a List of all drivers with Serverrequest");
        System.out.println("Returns a List of all drivers");
        List<Driver> driverList = new ArrayList<Driver>();
        try {
            HttpClient client = new HttpClient(new URI( baseURL ));
            HttpResponse response = client.sendData(HttpClient.HTTP_METHOD.GET);
            System.out.println(response.getData());
            driverList = Arrays.asList(objectMapper.readValue(response.getData(), Driver[].class));
        }catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return driverList;
    }

    @Override
    public void delete(String id) {
        System.out.println("Find DriverDatabaseModel by id");

        System.out.println("if driver at id == null -> throw not found exception");

        System.out.println("Remove address");
        System.out.println("Remove driver");
    }


}
