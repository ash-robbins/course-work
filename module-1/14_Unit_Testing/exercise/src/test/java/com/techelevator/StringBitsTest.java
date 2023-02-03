package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {

    @Test
    public void ProvideString_ExpectString_EveryOtherLetter() {
        //Arrange
        StringBits stringBits = new StringBits();
        String string = "Hello";
        String expectedString = "Hlo";

        // Act
        String actualResult = stringBits.getBits(string);

        //Assert
        Assert.assertEquals(expectedString, actualResult);

    }

    @Test
    public void ProvideStringTwoCharString_ExpectString_EveryOtherLetter() {
        //Arrange
        StringBits stringBits = new StringBits();
        String string = "Ok";
        String expectedString = "O";

        // Act
        String actualResult = stringBits.getBits(string);

        //Assert
        Assert.assertEquals(expectedString, actualResult);

    }

    @Test
    public void ProvideString_RandomWords_ExpectString_EveryOtherLetter() {
        //Arrange
        StringBits stringBits = new StringBits();
        String string = "LBJMJAI";
        String expectedString = "LJJI";

        // Act
        String actualResult = stringBits.getBits(string);

        //Assert
        Assert.assertEquals(expectedString, actualResult);

    }
}
