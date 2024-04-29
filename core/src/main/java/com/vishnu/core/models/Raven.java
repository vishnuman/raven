package com.vishnu.core.models;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import javax.annotation.PostConstruct;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import com.google.gson.Gson;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Raven {

    private String name;
    private String username;
    private String email;
    private String website;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    @PostConstruct
    public void init() {
        String apiUrl = "https://jsonplaceholder.typicode.com/users/5";
        fetchExternalData(apiUrl);
    }

    private void fetchExternalData(String apiUrl) {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(apiUrl);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder responseBuilder = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                responseBuilder.append(line);
            }
            br.close();

            Gson gson = new Gson();
            ExternalData data = gson.fromJson(responseBuilder.toString(), ExternalData.class);

            this.name = data.getName();
            this.username = data.getUsername();
            this.email = data.getEmail();
            this.website = data.getWebsite();
            this.phone = data.getPhone();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }       
    }

    private static class ExternalData {
        private String name;
        private String username;
        private String email;
        private String website;
        private String phone;

        public String getPhone() {
            return phone;
        }

        public String getWebsite() {
            return website;
        }

        public String getName() {
            return name;
        }

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }
    }
}
