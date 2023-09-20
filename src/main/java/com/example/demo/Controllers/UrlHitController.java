package com.example.demo.Controllers;

public class UrlHitController {

    String urlString = "http://localhost:8080/api/v1/visitor-count-app/username/";

    // creating a URL
    URL url = new URL(urlString);

    // Creating a connection
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

    // Getting response code
    int responseCode = connection.getResponseCode();
}
