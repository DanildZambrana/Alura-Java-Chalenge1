package io.github.danildzambrana;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProjectProperties {
    private String apiKey;

    public void loadProperties() {
        try {
            InputStream input = new FileInputStream("src/main/resources/config.properties");
            Properties properties = new Properties();

            properties.load(input);

            apiKey = properties.getProperty("API_KEY");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getApiKey() {
        return apiKey;
    }
}
