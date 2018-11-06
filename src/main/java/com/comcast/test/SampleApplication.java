package com.comcast.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot application loading
 *
 * @author - CHANDRA SEKHAR AADHANAPATTU - 01-NOV-2018
 */

@SpringBootApplication
public class SampleApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SampleApplication.class);
        app.run(args);
    }



}
