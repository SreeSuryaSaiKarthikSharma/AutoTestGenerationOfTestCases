package com.example.UnitTest;
import org.junit.jupiter.api.*;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.assertj.core.api.Assert;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.time.*;
import java.util.regex.*;
import javax.swing.*;
import java.net.*;
import java.sql.*;
import org.springframework.http.*;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class TestGenerationTestCase {

TestGeneration testgeneration;

@BeforeEach
public void setUp() { 
testgeneration= new TestGeneration();
}

@Test
public void testINPUT_FILE() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 employee.setINPUT_FILE("John");
 // Act
 // Assert
 Assertions.assertEquals("John", employee.getINPUT_FILE());
}

@Test
public void testOUTPUT_DIRECTORY() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 employee.setOUTPUT_DIRECTORY("John");
 // Act
 // Assert
 Assertions.assertEquals("John", employee.getOUTPUT_DIRECTORY());
}

}
