package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

    @Test
    public void ProvideArrayOfNumbers_ExpectProperOutCome() {
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();
       int[] numbers = {1, 2, 3};

       boolean expectedResponse = false;

        // Act
        boolean actualResult = sameFirstLast.isItTheSame(numbers);

        //Assert
        Assert.assertEquals(expectedResponse, actualResult);

    }

    @Test
    public void ProvideArrayOfNumbers_TrueResults_ExpectProperOutCome() {
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] numbers = {1, 2, 3, 1};

        boolean expectedResponse = true;

        // Act
        boolean actualResult = sameFirstLast.isItTheSame(numbers);

        //Assert
        Assert.assertEquals(expectedResponse, actualResult);

    }

    @Test
    public void ProvideArrayOfNumbers_Random_ExpectProperOutCome() {
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] numbers = {1, 2, 1};

        boolean expectedResponse = true;

        // Act
        boolean actualResult = sameFirstLast.isItTheSame(numbers);

        //Assert
        Assert.assertEquals(expectedResponse, actualResult);

    }
}
