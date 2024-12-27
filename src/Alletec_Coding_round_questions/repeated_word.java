package Alletec_Coding_round_questions;


import java.util.*;
public class repeated_word {

        public static void findOccurrences(String sentence) {
            if (sentence == null || sentence.isEmpty()) {
                System.out.println("Sentence cannot be empty.");
                return;
            }

            String[] words = sentence.toLowerCase().split("\\s+");  // Split the sentence

            HashMap<String, Integer> wordCount = new HashMap<>();    // word counts

            for (String word : words) {

                if (wordCount.containsKey(word)) {// Increment the count for each word
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }

            // Print words that appear more than once
            System.out.println("Repeated words and their occurrences:");
            for (String key : wordCount.keySet()) {
                if (wordCount.get(key) > 1) {
                    System.out.println(key + " : " + wordCount.get(key));
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String sentence = sc.nextLine();

            findOccurrences(sentence); // function call
        }
    }

