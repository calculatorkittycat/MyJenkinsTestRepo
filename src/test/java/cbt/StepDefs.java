package cbt;

import static org.junit.Assert.fail;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


public class StepDefs {

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
        Assert.assertEquals(1,1);
        System.out.println("HHHEEYYYY");
        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_DELETE);
      //  Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Driver.getDriver().manage().window().maximize();
        //Driver.getDriver().get("http://etsy.com");

    }



}
