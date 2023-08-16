package com.example.UnitTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class UnitTestingApplication {
   
    public static void main(String[] args) {
        TestGeneration generation = new TestGeneration();
       generation.generateTestCases("com.example.UnitTest");
       
       TestGeneration controllerGeneration = new TestGeneration();
       controllerGeneration.generateTestCases("com.example.Controllers");
       
    		SpringApplication.run(UnitTestingApplication.class, args);
    
    }

}

