package com.team11.stepdefinitions;

import com.team11.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.defaultParser;
import static io.restassured.RestAssured.given;

public class ApiStepDefinitions {
    Response response;
    JsonPath jsonPath;
    @Given("user sets all response using end point {string}")
    public void user_sets_all_response_using_end_point(String customer_url) {
        response=given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(customer_url)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
    //response.prettyPrint();
    }

    @Given("user deserialization data json to java pojo")
    public void user_deserialization_data_json_to_java_pojo() {
            jsonPath=response.jsonPath();

    }
    @Given("user validates data.")
    public void user_validates_data() {
        //firstname value larini list halinde return eder
        List<String> listFirstname=jsonPath.getList("firstName");
        System.out.println(listFirstname);
        //country icindeki name value larini list hainde return eder
        List<String> listCountryName=jsonPath.getList("country.name");
        System.out.println(listCountryName);
        List<String> listUserEmail=jsonPath.getList("user.email");
        System.out.println(listUserEmail);
        List<String> listCustomerSSN=jsonPath.getList("ssn");
        System.out.println(listCustomerSSN);
        Assert.assertTrue("SSN kaydi yok",listCustomerSSN.contains("321-54-9800"));
    }



}
