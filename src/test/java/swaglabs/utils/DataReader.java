package swaglabs.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

import java.io.FileReader;
import java.io.IOException;

public class DataReader {
    private static final String dataDirectory = "src/test/resources/data/";
    private static final EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
    private JsonObject environmentData;

    public static DataReader initialize(String fileName) {
        DataReader reader = new DataReader();
        reader.environmentData = reader.loadEnvironmentData(fileName);
        return reader;
    }

    private static String getEnvironment() {
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("environment");
    }

    private static JsonObject getJsonData(String fileName) throws IOException {
        String filePath = dataDirectory + fileName + ".json";
        try (FileReader reader = new FileReader(filePath)) {
            return JsonParser.parseReader(reader).getAsJsonObject();
        }
    }

    private JsonObject loadEnvironmentData(String fileName) {
        try {
            String environment = getEnvironment();
            JsonObject jsonData = getJsonData(fileName);
            JsonObject environmentData = jsonData.getAsJsonObject(environment);
            if (environmentData == null) {
                throw new RuntimeException("No data found for environment: " + environment);
            }
            return environmentData;
        } catch (IOException e) {
            throw new RuntimeException("Failed to read data file: " + fileName, e);
        }
    }

    public String getString(String key) {
        JsonElement value = environmentData.get(key);
        if (value == null || !value.isJsonPrimitive() || !value.getAsJsonPrimitive().isString()) {
            throw new RuntimeException("No valid string value found for key: " + key);
        }
        return value.getAsString();
    }

    public int getInt(String key) {
        JsonElement value = environmentData.get(key);
        if (value == null || !value.isJsonPrimitive() || !value.getAsJsonPrimitive().isNumber()) {
            throw new RuntimeException("No valid int value found for key: " + key);
        }
        return value.getAsInt();
    }

    public boolean getBoolean(String key) {
        JsonElement value = environmentData.get(key);
        if (value == null || !value.isJsonPrimitive() || !value.getAsJsonPrimitive().isBoolean()) {
            throw new RuntimeException("No valid boolean value found for key: " + key);
        }
        return value.getAsBoolean();
    }
}
