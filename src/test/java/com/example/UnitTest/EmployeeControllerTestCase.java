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
public class EmployeeControllerTestCase {

EmployeeController employeecontroller;

@BeforeEach
public void setUp() { 
employeecontroller= new EmployeeController();
}

@Test
public void testemployeeService() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 employee.setEmployeeService(null);
 // Act
 // Assert
 Assertions.assertEquals(null, employee.getEmployeeService());
}

@Test
public void testGetAllEmployee() {
 // Arrange
 EmployeeController instance = new EmployeeController();
 List expectedValue = null;
 instance.getAllEmployee();
 // Act
 List result = instance.getAllEmployee();
 // Assert
 Assertions.assertEquals(expectedValue, result, "getAllEmployee ");
}

}
