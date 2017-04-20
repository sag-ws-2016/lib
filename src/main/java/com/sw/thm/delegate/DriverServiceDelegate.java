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

    private String baseURL ="http://localhost:4567/driver";
    private ObjectMapper objectMapper = new ObjectMapper();

    //Defaultkonstruktor
    public DriverServiceDelegate() {
    }

    //Konstruktor mit Connectionstring
    public DriverServiceDelegate(String targetURL) {
        baseURL = targetURL;
    }

    @Override
    public void create(Driver newDriver) {
        HttpClient client = null;
        try {
            client = new HttpClient(new URI(baseURL));

            //map driver object to json
            String data =  objectMapper.dataToJson(newDriver);

            //send driver-data to server with put
            client.sendData(HttpClient.HTTP_METHOD.PUT, data);

            System.out.println("Creating driver was successfull");
        }
        catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(String id, Driver newDriver) {
        HttpClient client = null;
        try {
            client = new HttpClient(new URI(baseURL + "/" + id));

            //map driver object to json
            String data =  objectMapper.dataToJson(newDriver);

            //send driver-data to server with put
            client.sendData(HttpClient.HTTP_METHOD.PUT, data);

            System.out.println("Update driver was successfull");
        }
        catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Driver getByID(String id) {
        Driver driver = new Driver();

        HttpClient client = null;
        try {
            client = new HttpClient(new URI(baseURL + "/" + id));
            HttpResponse response = null;
            //get json data from server
            response = client.sendData(HttpClient.HTTP_METHOD.GET);
            System.out.println(response.getData());
            //map in object
            driver = objectMapper.readValue(response.getData(), Driver.class);
        }catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
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
        HttpClient client = null;
        try {
            //set client as id
            client = new HttpClient(new URI(baseURL + "/" + id));
            //delete driver at id
            client.sendData(HttpClient.HTTP_METHOD.DELETE);
            System.out.println("Driver " + id + " deleted");
        }
        catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
