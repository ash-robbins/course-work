package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PetTest {

    @Test

    public void TestVaccination() {
        //Arrange
        Pet pet = new Pet("TestName", "TestSpecies");
        String vaccinations = "Rabies";
        //List<String> vaccineTest = new List<String>("Rabies, Parvo", "Distemper");
        String expected = "Rabies";

        //Act
        Assert.assertEquals("The vaccine returned from person is not in the correct.",
                "Rabies",
                pet.getVaccinations());
    }
}
