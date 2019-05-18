package com.kata.stringcalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Before
    public void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void itShouldReturnZeroForEmptyString() {
        int zero = stringCalculator.add("");
        Assert.assertEquals(0, zero);
    }

    @Test
    public void itShouldReturnSumOfAllTheNumbers() {
        int sumOfTestInputOne = stringCalculator.add("1,2,3");
        int sumOfTestInputTwo = stringCalculator.add("1,2");
        Assert.assertEquals(6, sumOfTestInputOne);
        Assert.assertEquals(3, sumOfTestInputTwo);
    }

    @Test
    public void itShouldHandleUnknownAmountOfNumber() {
        int zero = stringCalculator.add("165141891561651561,16119165198181651561,198115665651");
        Assert.assertEquals(0, zero);
    }

    @Test
    public void itShouldHandleNewLinesBetweenNumbersAsWell() {
        int sum = stringCalculator.add("1\n2\n3");
        int sumTestTwo = stringCalculator.add("1,\n");
        int sumTestThree = stringCalculator.add("1\n2,3");
        Assert.assertEquals(6, sum);
        Assert.assertEquals(0, sumTestTwo);
        Assert.assertEquals(6, sumTestThree);
    }

    @Test
    public void itShouldSupportFirstLineDelimiter() {
        int sum = stringCalculator.add("//;\n1;2");
        Assert.assertEquals(3, sum);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void  itShouldCheckForNegativeNumbersAndThrowNegativesNotAllowedException() {
        expectedException.expect(NegativesNotAllowedException.class);
        expectedException.expectMessage("Negatives not allowed: -12,-3,-4");
        int sum = stringCalculator.add("-12,-3,-4");

    }
}
