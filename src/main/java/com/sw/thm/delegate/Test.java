package com.sw.thm.delegate;

import com.sw.thm.model.Driver;
import com.sw.thm.util.ObjectMapper;

/**
 * Created by christophcaps on 19.04.17.
 */


public class Test {

    public static void main(String [] args)
    {
        DriverServiceDelegate driverServiceDelegate = new DriverServiceDelegate();
        Driver hallo = new Driver();
        driverServiceDelegate.update("77014d97-ff94-481d-99f4-d57f44b67aea", hallo);
    }
}
