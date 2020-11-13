package com.team11.stepdefinitions;

import com.team11.utilities.DatabaseUtility;
import com.team11.utilities.Driver;
import io.cucumber.java.en.Given;

import java.util.List;

public class CreaeNewAccountStepDefinitions {

    @Given("kullanici veritabanina baglanir")
    public void kullanici_veritabanina_baglanir() {
        DatabaseUtility.createConnection();

        String query = "SELECT * FROM public.tp_customer";
        List<Object> list = DatabaseUtility.getColumnData(query, "email");

        for(Object w : list){
            System.out.println(w.toString());
        }

        Driver.getDriver().get("http://google.com");

    }

}
