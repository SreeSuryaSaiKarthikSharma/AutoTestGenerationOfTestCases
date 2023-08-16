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
public class EmployeeServiceTestCase {

EmployeeService employeeservice;

@BeforeEach
public void setUp() { 
employeeservice= new EmployeeService();
}

@Test
public void testemployeeRepository() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 employee.setEmployeeRepository(null);
 // Act
 // Assert
 Assertions.assertEquals(null, employee.getEmployeeRepository());
}

@Test
public void testGetAllEmployee() {
 // Arrange
 EmployeeService instance = new EmployeeService();
 List expectedValue = null;
 instance.getAllEmployee();
 // Act
 List result = instance.getAllEmployee();
 // Assert
 Assertions.assertEquals(expectedValue, result, "getAllEmployee ");
}

}
