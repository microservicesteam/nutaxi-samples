package com.microservicesteam;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = { "com.microservicesteam:nutaxi-contract-sample-server:+:stubs:8080" }, workOffline = true)
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
