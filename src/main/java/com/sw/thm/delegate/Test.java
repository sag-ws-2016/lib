package com.sw.thm.delegate;

import com.sw.thm.util.ObjectMapper;

/**
 * Created by christophcaps on 19.04.17.
 */


public class Test {

    public static void main(String [] args)
    {
        DriverServiceDelegate driverServiceDelegate = new DriverServiceDelegate();
        System.out.println(new ObjectMapper().dataToJson(driverServiceDelegate.getByID("3e0bd7c1-93ca-41c0-961d-dad6dd33aa12")));
    }
}
