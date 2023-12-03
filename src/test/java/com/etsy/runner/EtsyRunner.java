package com.etsy.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*

    Runner class will run all our feature files or our test in one place which is EtsyRunner

    @RunWith annotation comes from JUnit, this will run our feature files and stepDefinitions

    @CucumberOptions it's just special class with some keywords

    feature = we need to provide the path of feature file ex: src/test/resources/etsy

    glue = here we provide the path for stepDefinition class. It does not start from src instead
            it will start from under green java folder (test source folder)
            ex: com/etsy/step_definition

    dryRun = it will indicate whether our test should run or not based on true/false

             if we set dryRun = true, then our test will not run and if we are missing our
             snippets this dryRun = true will generate snippets

             if we set dryRun = false, it will run our tests

    tags = is needed when we give tag names in our feature file

            ex: if etsy.feature file has a tag as @smoke at the beginning, based on that tag
                our test will run. We can provide multiple tags such as @smoke, @regression
                naming of tags do not matter.


 */
@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/etsy", // is the location of our feature files
        glue = "com/etsy/step_definitions",  // this is the path/location of our step_definitions
        dryRun = false, // this can be toggled between true and false. See above note about this dryRun
        tags = "@smoke" // this a tag that was provided inside feature file. Based on this tag, our test will run

)
public class EtsyRunner {  // this is runner class green arrow button will run our tests

    // THIS RUNNER CLASS IS SPECIFIC TO ONLY ETSY

    // EACH DIFFERENT TESTS FOR EXAMPLE ETSY OR GOOGLE OR AMAZON WILL HAVE THEIR OWN RUNNER CLASS



}
