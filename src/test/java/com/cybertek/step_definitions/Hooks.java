package com.cybertek.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUpScenario(){
        System.out.println("Setting up browser with further details...");
    }
    @After
    public void tearDownScenario(){
        System.out.println("Closing browser");
        System.out.println("Take a screenshot");
    }
}
