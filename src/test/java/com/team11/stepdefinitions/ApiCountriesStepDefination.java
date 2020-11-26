package com.team11.stepdefinitions;


import com.sun.deploy.ref.AppRef;
import com.team11.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class ApiCountriesStepDefination {
    Response response;
    JsonPath jsonPath;
    @Given("In countries user sets all response using end point")
    public void In_countries_user_sets_all_response_using_end_point() {
        Response response = given().headers(
                    "Authorization",
                    "Bearer " + ConfigurationReader.getProperty("token"),
                    "Content-Type",
                   ContentType.JSON,
                    "Accept",
                    ContentType.JSON)
                    .when()
                    .get(ConfigurationReader.getProperty("api_countries"))
                    .then()
                    .contentType(ContentType.JSON)
                    .statusCode(200)
                    .extract()
                    .response();
            response.prettyPrint();
        }

        @Given("In countries user deserialization data json to java pojo")
        public void In_countries_user_deserialization_data_json_to_java_pojo () {

                jsonPath=response.jsonPath();

        }
        @Given("In countries user validates data.")
        public void In_countries_user_validates_data () {
            //firstname value larini list halinde return eder
            List<Integer> listid=jsonPath.getList("id");
            System.out.println(listid);
            //country icindeki name value larini list hainde return eder
            List<String> listname=jsonPath.getList("name");
            System.out.println(listname);
        //    List<String> liststates=jsonPath.getList("states");
          //  System.out.println(liststates);

            Assert.assertTrue("name kaydi yok",listname.contains("Norwegan"));

        }


    }

