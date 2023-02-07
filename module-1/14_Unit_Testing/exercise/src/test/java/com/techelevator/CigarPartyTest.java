package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

    @Test

    public void ProvideNumberOfCigars_OnWeekend_ExpectedSuccessfulParty() {
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

    public void ProvideNumberOfCigars_OverMaximum_SuccessfulParty() {
        //Arrange
        CigarParty numberOfCigars = new CigarParty();
        boolean isWeekend = false;
        int cigars = 62;
        boolean expectedSuccess = false;

        // Act
        boolean actualOutcome = numberOfCigars.haveParty(cigars, isWeekend);

        //Assert
        Assert.assertEquals(expectedSuccess, actualOutcome);
    }

    @Test

    public void ProvideNumberOfCigarsBelowMinimum_OnWeekend_ExpectedUnSuccessfulParty() {
        //Arrange
        CigarParty numberOfCigars = new CigarParty();
        boolean isWeekend = true;
        int cigarsCount =33;
        boolean expectedSuccess = false;

        // Act
        boolean actualOutcome = numberOfCigars.haveParty(cigarsCount, isWeekend);

        //Assert
        Assert.assertEquals(expectedSuccess, actualOutcome);



    }
}
