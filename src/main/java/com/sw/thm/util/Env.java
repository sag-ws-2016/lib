package com.sw.thm.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jonas on 20.04.17.
 */

public final class Env {
    public static Map<String, Object> getFormattedOverwrites() {
        Map<String, String> env = System.getenv();
        Map<String, Object> configOverrides = new HashMap<>();
        for (String envName : env.keySet()) {
            if (envName.contains("DATABASE_URL")) {
                try {
                    URI uri = new URI(env.get(envName));
                    String[] userInfo = uri.getUserInfo().split(":");
                    String user = userInfo[0];
                    String password = userInfo[1];
                    String url = "jdbc:" + uri.getScheme() + "://"
                            + uri.getHost() + ":" + uri.getPort() + uri.getRawPath();
                    if(uri.getRawQuery() != null)
                        url += "?" + uri.getRawQuery();
                    configOverrides.put("javax.persistence.jdbc.user", user);
                    configOverrides.put("javax.persistence.jdbc.password", password);
                    configOverrides.put("javax.persistence.jdbc.url", url);

                } catch (URISyntaxException e) {
                    e.printStackTrace();
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }        
            }
        }
        return configOverrides;
    }
}