package com.example.unittestdemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class UnitTestDemoApplicationTests {

    @Mock
    StringTest stringTestMock;


    @BeforeAll
    static void startTest() {
        System.out.println("Starting test");
    }

    @Test
    void testCar() {
        assertEquals("This is Ford", stringTestMock.carBrand("Ford"));
    }

    @Test
    void testCar2() {
        when(stringTestMock.carBrand("Ford")).thenReturn("This is Toyota");
        assertEquals("This is Ford", stringTestMock.carBrand("Ford"));
    }

    @AfterAll
    static void finishTest() {
        System.out.println("Finish test");
    }

}
