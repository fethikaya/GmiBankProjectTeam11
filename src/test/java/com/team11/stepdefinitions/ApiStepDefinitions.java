package com.team11.stepdefinitions;

import com.team11.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiStepDefinitions {

    @Given("user go to Gmibank Api adress and assert it.")
    public void user_go_to_Gmibank_Api_adress_and_assert_it() {
        Response response=given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty("api_url"))
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

    }

    @Given("user gets all data and read")
    public void user_gets_all_data_and_read() {
        Response response=given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty("api_url"))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();
    }

    @Given("user verifies user data and previously created data.")
    public void user_verifies_user_data_and_previously_created_data() {

    }

    @Given("user verifies user data and previously created data one by one")
    public void user_verifies_user_data_and_previously_created_data_one_by_one() {

    }

}
