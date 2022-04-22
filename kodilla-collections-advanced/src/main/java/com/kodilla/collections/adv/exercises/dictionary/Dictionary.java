package com.kodilla.collections.adv.exercises.dictionary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    /*Kluczami są polskie słowa, a wartościami – listy odpowiadających im słów angielskich.*/
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();


    public void addWord(String polishWord, EnglishWord englishWord) {          /*Metoda ta pobiera z mapy listę angielskich słów,
    odpowiadających wskazanemu słowu polskiemu. getOrDefault zwraca podaną jako argument wartość domyślną,                                                                                 gdy mapa nie zawiera szukanego przez nas wpisu */
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>()); /*szuka klucza -polskie słowo - jak nie ma to wtedy pusta lista*/
        englishWords.add(englishWord);                                                  /*Do tej listy (dotychczas istniejących w mapie słów angielskich lub nowej pustej listy) dodawany jest nasz wpis.*/
        dictionary.put(polishWord, englishWords);         /*wpis wstawiany jest do mapy*/

        //dictionary.put(polishWord, Collections.singletonList(englishWord)); /*lista z jednym elementem, dodawane słowo zastępywało by już istniejące*/

    }

    /*typem zwracanym przez obie metody findEnglishWords jest lista obiektów typu EnglishWord*/
    public List<EnglishWord> findEnglishWords(String polishWord) {
        return dictionary.getOrDefault(polishWord, Collections.emptyList());     /*co wskazuje na to że to lista angielskich słów?*/
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishWord : dictionary.getOrDefault(polishWord, Collections.emptyList())) {
            if (englishWord.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishWord);
        }
        return result;
    }

    public int size() {
        return dictionary.size();
    }
}
