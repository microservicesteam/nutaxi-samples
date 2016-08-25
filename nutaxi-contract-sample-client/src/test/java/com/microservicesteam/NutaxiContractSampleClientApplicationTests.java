package com.microservicesteam;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NutaxiContractSampleClientApplicationTests {

    @Autowired
    private RouteService service;

    @Test
    public void shouldRouteSuccessFullyRetrieved() {
        String routeId = "1";

        Route route = service.retrieveRoute(routeId);

        assertThat(route).isEqualTo(new Route(routeId, "Szeged", "Budapest"));

    }

}
