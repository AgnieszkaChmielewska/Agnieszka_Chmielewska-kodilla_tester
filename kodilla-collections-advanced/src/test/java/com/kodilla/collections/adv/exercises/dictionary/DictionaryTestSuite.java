package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {
    @Test
    public void testAddWord() {
//        Given
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");
//        When
        dictionary.addWord(polishWord, englishWord);
//        Then
        assertEquals(1, dictionary.size());
    }

    @Test
    public void testFindEnglishWords() {
//        Given
        Dictionary dictionary = new Dictionary();

        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "play"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));
//        When
        System.out.println(dictionary.size());
        List<EnglishWord> result = dictionary.findEnglishWords("gra");
//        Then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add((new EnglishWord(PartOfSpeech.NOUN,"play")));
        expectedList.add((new EnglishWord(PartOfSpeech.NOUN,"game")));
        assertEquals(expectedList, result);      /*dlaczego porównanie dwó różnych obiektów dajae ten sam wynik, mają różne adresy ale mają tą samą zawartość, którą sparawdza moetoda equals?*/
        assertEquals(2, result.size());

    }

    @Test
    public void testFindEnglishWords_withPartOfSpeech() {
//        Given
        Dictionary dictionary = new Dictionary();

        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.VERB, "take"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));
//        When
        System.out.println(dictionary.size());
        List<EnglishWord> result = dictionary.findEnglishWords("brać",PartOfSpeech.NOUN);
//        Then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add((new EnglishWord(PartOfSpeech.NOUN,"brotherhood")));

        assertEquals(expectedList, result); /*dlaczego porównanie dwóch różnych obiektów dljae ten sam wynik?*/
        assertEquals(1, result.size());

    }

}