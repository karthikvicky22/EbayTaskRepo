package org.ebay.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\featureFiles\\ProductSearchFunction.feature",
glue="org.ebaystepdefinition",monochrome = true ,dryRun =false)

public class Product {

}
