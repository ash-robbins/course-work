package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {

    @Test
    public void ProvideLastNumberIsTheHighest_ExpectLastNumber() {
        //Arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();
        int[] numbers = {1, 2, 3};
        int[] expectedReturnArray = {3, 3, 3};

        // Act
        int[] actualReturnArray = maxEnd3.makeArray(numbers);

        //Assert
        Assert.assertArrayEquals(expectedReturnArray, actualReturnArray);

    }

    @Test
    public void ProvideFirstNumberIsTheHighest_ExpectFirstNumber() {
        //Arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();
        int[] numbers = {11, 5, 9};
        int[] expectedReturnArray = {11, 11, 11};

        // Act
        int[] actualReturnArray = maxEnd3.makeArray(numbers);

        //Assert
        Assert.assertArrayEquals(expectedReturnArray, actualReturnArray);

    }

    @Test
    public void ProvideTheHighest_InMiddle_ExpectFirstNumber() {
        //Arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();
        int[] numbers = {2, 11, 3};
        int[] expectedReturnArray = {3, 3, 3};

        // Act
        int[] actualReturnArray = maxEnd3.makeArray(numbers);

        //Assert
        Assert.assertArrayEquals(expectedReturnArray, actualReturnArray);

    }
}
