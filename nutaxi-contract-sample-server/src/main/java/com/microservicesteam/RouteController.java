package com.microservicesteam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {

    private static final String ROUTE_SERVICE_JSON_VERSION_1 = "application/vnd.route.v1+json";

    @RequestMapping(value = "/route/{routeId}", method = GET, consumes = ROUTE_SERVICE_JSON_VERSION_1, produces = ROUTE_SERVICE_JSON_VERSION_1)
    public Route route(@PathVariable String routeId) {
        return new Route(routeId, "Szeged", "Budapest");
    }

}