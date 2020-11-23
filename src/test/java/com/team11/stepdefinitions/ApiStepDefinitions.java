package com.team11.stepdefinitions;

import com.team11.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiStepDefinitions {


    @Given("user sets all response using end point {string}")
    public void user_sets_all_response_using_end_point(String string) {
        Response response=given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty("api_customer"))
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();
    }

    @Given("user deserialization data json to java pojo")
    public void user_deserialization_data_json_to_java_pojo() {



    }
    @Given("user validates data.")
    public void user_validates_data() {

    }



}
