package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

    @Test
    public void ProvideKnownSequenceOfChar_ExpectKnownSequenceOfChar() {
        //Arrange
        FrontTimes frontTimes = new FrontTimes();
        String str = "Chocolate";
        int n = 2;
        String expectedSequenceChar = "ChoCho";

        // Act
        String actualSequenceChar = frontTimes.generateString(str, n);

        //Assert
        Assert.assertEquals(expectedSequenceChar, actualSequenceChar);

    }

    @Test
    public void ProvideKnownSequenceOfChar_Increase_ExpectKnownSequenceOfChar() {
        //Arrange
        FrontTimes frontTimes = new FrontTimes();
        String str = "Vanilla";
        int n = 3;
        String expectedSequenceChar = "VanVanVan";

        // Act
        String actualSequenceChar = frontTimes.generateString(str, n);

        //Assert
        Assert.assertEquals(expectedSequenceChar, actualSequenceChar);

    }

    @Test
    public void ProvideKnownSequenceOfChar_Minimum_ExpectKnownSequenceOfChar() {
        //Arrange
        FrontTimes frontTimes = new FrontTimes();
        String str = "Car";
        int n = 3;
        String expectedSequenceChar = "CarCarCar";

        // Act
        String actualSequenceChar = frontTimes.generateString(str, n);

        //Assert
        Assert.assertEquals(expectedSequenceChar, actualSequenceChar);

    }
}


