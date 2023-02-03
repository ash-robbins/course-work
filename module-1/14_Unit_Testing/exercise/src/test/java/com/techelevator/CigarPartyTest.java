package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

    @Test

    public void ProvideNumberOfCigars_ExpectSuccessfulParty() {
        //Arrange
        CigarParty numberOfCigars = new CigarParty();
        boolean isWeekend = true;
        int cigars = 40;
        boolean expectedSuccess = true;

        // Act
        boolean actualOutcome = numberOfCigars.haveParty(cigars, isWeekend);

        //Assert
        Assert.assertEquals(expectedSuccess, actualOutcome);

    }

    @Test

    public void ProvideNumberOfCigars_Mixed_ExpectSuccessfulParty() {
        //Arrange
        CigarParty numberOfCigars = new CigarParty();
        boolean isWeekend = false;
        int cigars = 39;
        boolean expectedSuccess = false;

        // Act
        boolean actualOutcome = numberOfCigars.haveParty(cigars, isWeekend);

        //Assert
        Assert.assertEquals(expectedSuccess, actualOutcome);
    }

    @Test

    public void ProvideNumberOfCigars_High_ExpectSuccessfulParty() {
        //Arrange
        CigarParty numberOfCigars = new CigarParty();
        boolean isWeekend = true;
        int cigars = 70;
        boolean expectedSuccess = true;

        // Act
        boolean actualOutcome = numberOfCigars.haveParty(cigars, isWeekend);

        //Assert
        Assert.assertEquals(expectedSuccess, actualOutcome);


    }
}
