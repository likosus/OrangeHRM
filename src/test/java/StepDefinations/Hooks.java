package StepDefinations;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {
    @After
    public void after(Scenario senaryo){
        System.out.println("Senaryo bitti");

        GWD.quitDriver();
    }
}
