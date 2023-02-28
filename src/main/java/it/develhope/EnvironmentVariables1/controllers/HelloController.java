package it.develhope.EnvironmentVariables1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Drumstyle92
 * Controller class to be able to handle the CRUD of calls
 */
@RestController
public class HelloController {

    /**
     * Automatic insertion with the Environment interface to be able to use data from an environment with methods
     */
    @Autowired
    Environment environment;


    /**
     * @return Returns a string with the developer's name and authentication code
     * Get method to be able to view the data in the chosen environment in response to the call
     */
    @GetMapping("/")
    public String getHello(){

        return "Hi dear developer " + environment.getProperty("myCustomProps.devName") +
                " your auth code is " + environment.getProperty("myCustomProps.authCode");

    }

}
