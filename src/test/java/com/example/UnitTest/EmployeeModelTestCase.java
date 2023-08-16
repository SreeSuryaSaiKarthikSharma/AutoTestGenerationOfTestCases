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
public class EmployeeModelTestCase {

EmployeeModel employeemodel;

@BeforeEach
public void setUp() { 
employeemodel= new EmployeeModel();
}

@Test
public void testEmp_Id() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 employee.setEmp_Id(1234L);
 // Act
 // Assert
 Assertions.assertEquals(1234L, employee.getEmp_Id());
}

@Test
public void testAge() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 employee.setAge(30);
 // Act
 // Assert
 Assertions.assertEquals(30, employee.getAge());
}

@Test
public void testEmployeeFirstName() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 employee.setEmployeeFirstName("John");
 // Act
 // Assert
 Assertions.assertEquals("John", employee.getEmployeeFirstName());
}

@Test
public void testEmployeeLastName() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 employee.setEmployeeLastName("John");
 // Act
 // Assert
 Assertions.assertEquals("John", employee.getEmployeeLastName());
}

@Test
public void testphoneNumber() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 employee.setPhoneNumber("John");
 // Act
 // Assert
 Assertions.assertEquals("John", employee.getPhoneNumber());
}

@Test
public void testEmailID() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 employee.setEmailID("John");
 // Act
 // Assert
 Assertions.assertEquals("John", employee.getEmailID());
}

@Test
public void testGetEmp_Id() {
 // Arrange
 EmployeeModel instance = new EmployeeModel();
 Long expectedValue = null;
 instance.getEmp_Id();
 // Act
 Long result = instance.getEmp_Id();
 // Assert
 Assertions.assertEquals(expectedValue, result, "getEmp_Id ");
}

@Test
public void testSetAge() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 int expectedValue = 0;
 // Act
 employee.setAge(expectedValue);
 // Assert
 SoftAssertions softAssertions = new SoftAssertions();
 softAssertions.assertThat(employee.getAge()).isEqualTo(expectedValue);
 softAssertions.assertAll();
}

@Test
public void testGetAge() {
 // Arrange
 EmployeeModel instance = new EmployeeModel();
 int expectedValue = 0;
 instance.getAge();
 // Act
 int result = instance.getAge();
 // Assert
 Assertions.assertEquals(expectedValue, result, "getAge ");
}

@Test
public void testSetEmp_Id() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 Long expectedValue = null;
 // Act
 employee.setEmp_Id(expectedValue);
 // Assert
 SoftAssertions softAssertions = new SoftAssertions();
 softAssertions.assertThat(employee.getEmp_Id()).isEqualTo(expectedValue);
 softAssertions.assertAll();
}

@Test
public void testSetEmailID() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 String expectedValue = null;
 // Act
 employee.setEmailID(expectedValue);
 // Assert
 SoftAssertions softAssertions = new SoftAssertions();
 softAssertions.assertThat(employee.getEmailID()).isEqualTo(expectedValue);
 softAssertions.assertAll();
}

@Test
public void testGetPhoneNumber() {
 // Arrange
 EmployeeModel instance = new EmployeeModel();
 String expectedValue = null;
 instance.getPhoneNumber();
 // Act
 String result = instance.getPhoneNumber();
 // Assert
 Assertions.assertEquals(expectedValue, result, "getPhoneNumber ");
}

@Test
public void testGetEmailID() {
 // Arrange
 EmployeeModel instance = new EmployeeModel();
 String expectedValue = null;
 instance.getEmailID();
 // Act
 String result = instance.getEmailID();
 // Assert
 Assertions.assertEquals(expectedValue, result, "getEmailID ");
}

@Test
public void testSetPhoneNumber() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 String expectedValue = null;
 // Act
 employee.setPhoneNumber(expectedValue);
 // Assert
 SoftAssertions softAssertions = new SoftAssertions();
 softAssertions.assertThat(employee.getPhoneNumber()).isEqualTo(expectedValue);
 softAssertions.assertAll();
}

@Test
public void testGetEmployeeFirstName() {
 // Arrange
 EmployeeModel instance = new EmployeeModel();
 String expectedValue = null;
 instance.getEmployeeFirstName();
 // Act
 String result = instance.getEmployeeFirstName();
 // Assert
 Assertions.assertEquals(expectedValue, result, "getEmployeeFirstName ");
}

@Test
public void testSetEmployeeFirstName() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 String expectedValue = null;
 // Act
 employee.setEmployeeFirstName(expectedValue);
 // Assert
 SoftAssertions softAssertions = new SoftAssertions();
 softAssertions.assertThat(employee.getEmployeeFirstName()).isEqualTo(expectedValue);
 softAssertions.assertAll();
}

@Test
public void testGetEmployeeLastName() {
 // Arrange
 EmployeeModel instance = new EmployeeModel();
 String expectedValue = null;
 instance.getEmployeeLastName();
 // Act
 String result = instance.getEmployeeLastName();
 // Assert
 Assertions.assertEquals(expectedValue, result, "getEmployeeLastName ");
}

@Test
public void testSetEmployeeLastName() {
 // Arrange
 EmployeeModel employee = new EmployeeModel();
 String expectedValue = null;
 // Act
 employee.setEmployeeLastName(expectedValue);
 // Assert
 SoftAssertions softAssertions = new SoftAssertions();
 softAssertions.assertThat(employee.getEmployeeLastName()).isEqualTo(expectedValue);
 softAssertions.assertAll();
}

}
