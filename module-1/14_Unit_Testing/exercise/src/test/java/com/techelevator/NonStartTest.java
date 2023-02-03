package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {

    @Test
    public void ProvideTwoValidStrings_ExpectMissingFirstChar() {
        //Arrange
        NonStart nonStart = new NonStart();
        String firstString = "Hello";
        String secondString= "There";
        String expectedReturnedString = "ellohere";

        // Act
        String actualReturnedString = nonStart.getPartialString(firstString, secondString);

        //Assert
        Assert.assertEquals(expectedReturnedString, actualReturnedString);

    }

    @Test
    public void ProvideTwoValidStrings_LowerCase_ExpectMissingFirstChar() {
        //Arrange
        NonStart nonStart = new NonStart();
        String firstString = "java";
        String secondString= "code";
        String expectedReturnedString = "avaode";

        // Act
        String actualReturnedString = nonStart.getPartialString(firstString, secondString);

        //Assert
        Assert.assertEquals(expectedReturnedString, actualReturnedString);

    }

    @Test
    public void ProvideTwoValidStrings_RandomString_ExpectMissingFirstChar() {
        //Arrange
        NonStart nonStart = new NonStart();
        String firstString = "shotl";
        String secondString= "java";
        String expectedReturnedString = "hotlava";

        // Act
        String actualReturnedString = nonStart.getPartialString(firstString, secondString);

        //Assert
        Assert.assertEquals(expectedReturnedString, actualReturnedString);

    }
}
