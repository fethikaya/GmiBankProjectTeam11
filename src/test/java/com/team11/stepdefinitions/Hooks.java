package com.team11.stepdefinitions;

import com.team11.utilities.Driver;
import org.junit.After;

public class Hooks {


    @After
    public  void tearDown() {


        System.out.println("###########-THE END-###################");

        Driver.getDriver().quit();
    }
}