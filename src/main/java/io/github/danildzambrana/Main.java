package io.github.danildzambrana;

import com.google.gson.Gson;
import io.github.danildzambrana.models.CurrencyDTO;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProjectProperties properties = new ProjectProperties();
        properties.loadProperties();
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Ingrese el monto a convertir:");
        double amount = inputReader.nextDouble();

        System.out.println("Ingrese la moneda de origen (USD, EUR, GBP, etc.):");
        String fromCurrency = inputReader.next();

        System.out.println("Ingrese la moneda de destino (USD, EUR, GBP, etc.):");
        String toCurrency = inputReader.next();

        String adress = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s/%f", properties.getApiKey(), fromCurrency, toCurrency, amount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(adress))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            CurrencyDTO currency = gson.fromJson(response.body(), CurrencyDTO.class);
            System.out.println(currency);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
