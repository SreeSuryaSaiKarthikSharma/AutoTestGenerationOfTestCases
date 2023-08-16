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
public class UnitTestingApplicationTestCase {

UnitTestingApplication unittestingapplication;

@BeforeEach
public void setUp() { 
unittestingapplication= new UnitTestingApplication();
}

}
