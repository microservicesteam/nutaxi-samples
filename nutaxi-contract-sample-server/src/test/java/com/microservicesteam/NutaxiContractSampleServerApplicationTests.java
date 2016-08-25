package com.microservicesteam;

import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;

import org.junit.Before;

public class NutaxiContractSampleServerApplicationTests {

    @Before
    public void setup() {
        standaloneSetup(new RouteController());
    }

}
