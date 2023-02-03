package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCountTest {

    @Test
    public void ProvideStringArray_ExpectWordCount() {
        //Arrange
        WordCount wordCount = new WordCount();
        String[] stringArray = {"ba", "ba", "black", "sheep"};
            Map<String, Integer> expectedResult = new HashMap<>();

            if (stringArray != null) {
                for (String word : stringArray) {
                    if (!expectedResult.containsKey(word)) {
                        expectedResult.put(word, 1);
                    } else {
                        expectedResult.put(word, expectedResult.get(word) + 1);
                    }
                }
            }


        // Act
        Map<String, Integer> actualResult = wordCount.getCount(stringArray);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void ProvideArray_Random_ExpectWordCount() {
        //Arrange
        WordCount wordCount = new WordCount();
        String[] stringArray = {"abc", "bc", "at", "dog"};
        Map<String, Integer> expectedResult = new HashMap<>();

        if (stringArray != null) {
            for (String word : stringArray) {
                if (!expectedResult.containsKey(word)) {
                    expectedResult.put(word, 1);
                } else {
                    expectedResult.put(word, expectedResult.get(word) + 1);
                }
            }
        }


        // Act
        Map<String, Integer> actualResult = wordCount.getCount(stringArray);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void ProvideArrayOfWords_Scramble_ExpectWordCount() {
        //Arrange
        WordCount wordCount = new WordCount();
        String[] stringArray = {"", "ba", "black", "sheep"};
        Map<String, Integer> expectedResult = new HashMap<>();

        if (stringArray != null) {
            for (String word : stringArray) {
                if (!expectedResult.containsKey(word)) {
                    expectedResult.put(word, 1);
                } else {
                    expectedResult.put(word, expectedResult.get(word) + 1);
                }
            }
        }


        // Act
        Map<String, Integer> actualResult = wordCount.getCount(stringArray);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }
}
