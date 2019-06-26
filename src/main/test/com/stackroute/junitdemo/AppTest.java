package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
    App app;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        app=new App();
    }
    @After
    public void testDown()
    {
        System.out.println("After");
        app=new App();
    }
    @BeforeClass
    public static void setUpBeforeClass()
    {
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void textDownAfterClass()
    {
        System.out.println("AfterClass");
    }
    @Test
    public void givenTwoStringsShouldReturnConcatenatedUpperString()
    {
        //arrange
        app=new App();
        //Add
        String result= app.concatAndConvertString("Hello","World");
        //Assert
        assertEquals("HELLOWORLD",result);

    }
    @Test
    public void givenTwoNullStringsShouldReturnErrorMessage()
    {
        //arrange
        app=new App();
        //Add
        String result= app.concatAndConvertString("","");
        //Assert
        assertEquals("Nullstrings are invalid",result);

    }
}