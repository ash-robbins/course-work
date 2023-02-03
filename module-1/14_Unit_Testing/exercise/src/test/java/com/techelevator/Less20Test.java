package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {

    @Test
    public void ProvideKnownNumberLessThanMultiple20_ExpectKnownNumberLessThanMultiple20() {
        //Arrange
        Less20 less20 = new Less20();
        int n = 18;
        boolean expectedValidNumber = true;

        // Act
        boolean actualNumberResult = less20.isLessThanMultipleOf20(n);

        //Assert
        Assert.assertEquals(expectedValidNumber, actualNumberResult);

    }

    @Test
    public void ProvideKnownNumberLessThanMultiple20_AnotherTrueResult_ExpectKnownNumberLessThanMultiple20() {
        //Arrange
        Less20 less20 = new Less20();
        int n = 19;
        boolean expectedValidNumber = true;

        // Act
        boolean actualNumberResult = less20.isLessThanMultipleOf20(n);

        //Assert
        Assert.assertEquals(expectedValidNumber, actualNumberResult);

    }

    @Test
    public void ProvideKnownNumberLessThanMultiple20_FalseResult_ExpectKnownNumberLessThanMultiple20() {
        //Arrange
        Less20 less20 = new Less20();
        int n = 20;
        boolean expectedValidNumber = false;

        // Act
        boolean actualNumberResult = less20.isLessThanMultipleOf20(n);

        //Assert
        Assert.assertEquals(expectedValidNumber, actualNumberResult);

    }

}
