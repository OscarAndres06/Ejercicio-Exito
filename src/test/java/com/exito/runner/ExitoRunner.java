package com.exito.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ="resources/features/ProductoExito.feature",
        glue = "com/exito/stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class ExitoRunner {
}