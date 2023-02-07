package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {

    @Test
    public void ProvideNoOnesAndNoThree_ExpectNoOnesAndNoThree() {
        //Arrange
        Lucky13 lucky13 = new Lucky13();
        int[] numbers = {0, 2, 4};
        boolean expectedReturnResponse = true;

        // Act
        boolean actualReturnResponse = lucky13.getLucky(numbers);

        //Assert
        Assert.assertEquals(expectedReturnResponse, actualReturnResponse);

    }

    @Test
    public void ProvideContainsOnesAndThree_ExpectNoOnesAndNoThree() {
        //Arrange
        Lucky13 lucky13 = new Lucky13();
        int[] numbers = {1, 2, 3};
        boolean expectedReturnResponse = false;

        // Act
        boolean actualReturnResponse = lucky13.getLucky(numbers);

        //Assert
        Assert.assertEquals(expectedReturnResponse, actualReturnResponse);

    }

    @Test
    public void ProvideAtLeastOneOneOneThree_ExpectNoOnesAndNoThree() {
        //Arrange
        Lucky13 lucky13 = new Lucky13();
        int[] numbers = {0, 2, 3};
        boolean expectedReturnResponse = false;

        // Act
        boolean actualReturnResponse = lucky13.getLucky(numbers);

        //Assert
        Assert.assertEquals(expectedReturnResponse, actualReturnResponse);

    }
}
