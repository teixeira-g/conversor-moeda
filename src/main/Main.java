package main;

import com.google.gson.Gson;
import models.ConversionResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String API_KEY = "4a26eabe71d608ee442675a2";
        String URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/BRL";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URL)).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();

        ConversionResponse cr = gson.fromJson(response.body(), ConversionResponse.class);

        Map<String, Double> rates = cr.getConversionRates();

        Scanner scanner = new Scanner(System.in);
        var opcao = 0;

        while(opcao != 7){
            System.out.println("******************************************************");
            System.out.println("Seja bem vindo(a) ao conversor de moedas");
            System.out.println("1) Dólar -> Peso Argentino");
            System.out.println("2) Peso Argentino -> Dólar");
            System.out.println("3) Dólar -> Real Brasileiro");
            System.out.println("4) Real Brasileiro -> Dólar");
            System.out.println("5) Dólar -> Peso Colombiano");
            System.out.println("6) Peso Colombiano -> Dólar");
            System.out.println("7) Sair");
            System.out.println("******************************************************");

            opcao = scanner.nextInt();

            if (opcao == 7){
                System.out.println("Até mais !");
                break;
            }

            System.out.println("Digite o valor que deseja converter");

            double valor = scanner.nextDouble();
            double resultado;

            switch (opcao){
                case 1:
                    //USD -> ARS
                    resultado = valor * (1/rates.get("USD")) * rates.get("ARS");
                    System.out.printf("%.2f USD = %.2f ARS%n", valor, resultado);
                    break;
                case 2:
                    //ARS -> USD
                    resultado = valor * (1/rates.get("ARS")) * rates.get("USD");
                    System.out.printf("%.2f ARS = %.2f USD%n", valor, resultado);
                    break;
                case 3:
                    //USD -> BRL
                    resultado = valor * (1/rates.get("USD")) * rates.get("BRL");
                    System.out.printf("%.2f USD = %.2f BRL%n", valor, resultado);
                    break;
                case 4:
                    //BRL -> USD
                    resultado = valor * (1/rates.get("BRL")) * rates.get("USD");
                    System.out.printf("%.2f BRL = %.2f USD%n", valor, resultado);
                    break;
                case 5:
                    //USD -> COP
                    resultado = valor * (1/rates.get("USD")) * rates.get("COP");
                    System.out.printf("%.2f USD = %.2f COP%n", valor, resultado);
                    break;
                case 6:
                    //COP -> USD
                    resultado = valor * (1/rates.get("COP")) * rates.get("USD");
                    System.out.printf("%.2f COP = %.2f USD%n", valor, resultado);
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }

        }
        scanner.close();
    }
}
