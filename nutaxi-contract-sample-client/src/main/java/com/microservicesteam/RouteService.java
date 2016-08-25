package com.microservicesteam;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.HttpMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RouteService {

    private static final String ROUTE_SERVICE_JSON_VERSION_1 = "application/vnd.route.v1+json";

    @Autowired
    private RestTemplate restTemplate;

    private int port = 8080;

    public Route retrieveRoute(String id) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(CONTENT_TYPE, ROUTE_SERVICE_JSON_VERSION_1);

        ResponseEntity<Route> response = restTemplate.exchange("http://localhost:" + port + "/route/" + id, GET,
                new HttpEntity<>(httpHeaders),
                Route.class);

        return response.getBody();
    }

}
