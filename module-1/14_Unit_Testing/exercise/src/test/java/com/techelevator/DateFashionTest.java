package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {

    @Test
    public void ProvideCombinedStyle_ExpectKnownStyleStandard() {
        //Arrange
        DateFashion dateFashion = new DateFashion();
        int you = 5;
        int date = 10;
        int expectedStyleResponse = 2;

        // Act
        int actualStyleResponse = dateFashion.getATable(you, date);

        //Assert
        Assert.assertEquals(expectedStyleResponse, actualStyleResponse);

    }

    @Test
    public void ProvideCombinedStyle_Low_ExpectKnownStyleStandard() {
        //Arrange
        DateFashion dateFashion = new DateFashion();
        int you = 5;
        int date = 2;
        int expectedStyleResponse = 0;

        // Act
        int actualStyleResponse = dateFashion.getATable(you, date);

        //Assert
        Assert.assertEquals(expectedStyleResponse, actualStyleResponse);

    }

    @Test
    public void ProvideCombinedStyle_Balanced_ExpectKnownStyleStandard() {
        //Arrange
        DateFashion dateFashion = new DateFashion();
        int you = 5;
        int date = 5;
        int expectedStyleResponse = 1;

        // Act
        int actualStyleResponse = dateFashion.getATable(you, date);

        //Assert
        Assert.assertEquals(expectedStyleResponse, actualStyleResponse);

    }

}

