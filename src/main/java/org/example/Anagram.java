package org.example;

import java.util.*;
public class Anagram {
    public static void displayAnagramPairs(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
//I used help online for this problem because I wasnt sure how to work out the anagram strings
        //You first start off by using a hash map to store the words selected aswell as the anagrams
        for (String word : words) {
            //Goes through each word in the input, then the char array will turn it into an array, then sort it alphabetically
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            //creates a listing for an anagram and then adds the word to the list with other anagram words
            map.putIfAbsent(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(word);
        }

        for (String key : map.keySet()) { //The for loop is used to iterate through each word listed in the hashmap

            List<String> anagrams = map.get(key);
//Takes the list of anagrams with the word inserted, and prints them if there are more then one words available
            if (anagrams.size() > 1) {
                // Join the anagrams with commas and print them
                System.out.println(String.join(", ", anagrams));
            }
        }
    }
}

