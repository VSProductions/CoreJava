package com.kata.stringcalculator;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String numbers) {
        String[] numberArr = parseNumbers(numbers);
        if (Objects.isNull(numberArr) || numberArr.length < 2)
            return 0;
        checkForNegatives(numberArr);
        return findSum(numberArr);
    }

    private void checkForNegatives(String[] numberArr) {
        List<String> negatives = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (String num : numberArr)
            if (num.startsWith("-"))
                sb.append(num).append(",");

        if (!sb.toString().isEmpty()) {
            throw new NegativesNotAllowedException("Negatives not allowed: ".concat(sb.toString()));
        }
    }

    private String[] parseNumbers(String numbers) {
        String delimiter = ",|\n";
        final Pattern pattern = Pattern.compile("^(\\/\\/)(.*)\\n", Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(numbers);
        if (matcher.find()) {
            delimiter = delimiter.concat("|").concat(matcher.group(2));
            numbers = numbers.substring(numbers.indexOf(matcher.group(2))+2);
        }
        return numbers.split(delimiter);
    }

    private int findSum(String[] numberArr) {
        int sum = 0;
        for (String num : numberArr) {
            try {
                sum += Integer.parseInt(num);
            } catch (NumberFormatException e) {
                return 0;
            }
        }
        return sum;
    }
}
