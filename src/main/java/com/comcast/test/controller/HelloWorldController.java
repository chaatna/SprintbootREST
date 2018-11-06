package com.comcast.test.controller;

import com.comcast.test.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author - CHANDRA SEKHAR AADHANAPATTU
 *
 * Controller class for test REST service
 *
 */

@RestController
public class HelloWorldController {

    private static final Logger logger = LogManager.getLogger(HelloWorldController.class);

    /**
     * Test REST endpoint
     * @return
     */
    @RequestMapping(Constants.TEST_END_POINT)
    @ResponseBody
    public String wishTheWorld() {
        logger.info("Inside wishTheWorld...");

        String str = "Hello World";

        logger.info("Response to test endpoint:{}", str);
        return str;
    }
}
