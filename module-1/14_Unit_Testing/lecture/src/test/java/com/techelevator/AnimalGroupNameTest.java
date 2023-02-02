package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTest {

    @Test
    public void ProvideKnownAnimalName_ExpectKnownHerdName(){
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String animalName = "giraffe";
        String expectedHerdName = "Tower";

        //Act
        String actualHerdName = animalGroupName.findHerd(animalName);


        //Assert
        Assert.assertEquals(expectedHerdName, actualHerdName);
    }

    @Test
    public void ProvideKnownAnimalName_MixedCase_ExpectKnownHerdName(){

        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String animalName = "giraffe";
        String expectedHerdName = "Tower";

        //Act
        String actualHerdName = animalGroupName.findHerd(animalName);


        //Assert
        Assert.assertEquals(expectedHerdName, actualHerdName);

    }

    @Test
    public void ProvideUnknownAnimalName_ExpectUnknownHerdName(){

        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String animalName = "";
        String animalName2 = "elephants";

        String expectedHerdName = "unknown";

        //Act
        String actualHerdName = animalGroupName.findHerd(animalName);
        String actualHerdName2 = animalGroupName.findHerd(animalName2);


        //Assert
        Assert.assertEquals(expectedHerdName, actualHerdName);
        Assert.assertEquals(expectedHerdName, actualHerdName2);

    }
}
