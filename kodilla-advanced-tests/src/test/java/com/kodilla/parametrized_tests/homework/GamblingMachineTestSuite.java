package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine.csv")
    public void shouldPass(String numbers) throws InvalidNumbersException {
        //Given
        String[] numbersAsStrings = numbers.split(";");
        //Set<String> where = numbers.split(":");  .split tylko na tablicy Stringów może być wywołany?

        Set<String> setCollectionOfStringNumbers =  new HashSet<>();
        for (String number : numbersAsStrings) {
            setCollectionOfStringNumbers.add(number);           // sprawdzam co się zapisało w collectionOfStringNumbers
            System.out.println(number);
        }
        Set<Integer> testedData = new HashSet<>();
        setCollectionOfStringNumbers.stream()
                 .mapToInt(Integer::parseInt)
                 .forEach(testedData::add);

        //When
        GamblingMachine gamblingMachine = new GamblingMachine();
        gamblingMachine.howManyWins(testedData);

        //Then
        assertEquals(6,testedData.size());
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineFalse.csv")
    public void shouldNotPass(String numbers) throws InvalidNumbersException {
        //Given
        String[] numbersAsStrings = numbers.split(";");

        Set<String> setCollectionOfStringNumbers =  new HashSet<>();
        for (String number : numbersAsStrings) {
            setCollectionOfStringNumbers.add(number);
            System.out.println(number);
        }
        Set<Integer> testedData = new HashSet<>();
        setCollectionOfStringNumbers.stream()
                 .mapToInt(Integer::parseInt)
                 .forEach(testedData::add);

        //When
        GamblingMachine gamblingMachine = new GamblingMachine();

        //Then
        assertThrows(InvalidNumbersException.class,()->gamblingMachine.howManyWins(testedData));
    }

}