package week3.day2;

public class RemoveduplicateWords {
	
	public static void main(String[] args) {
		
		        String text = "We learn Java basics as part of java sessions in java week1";

		        // Step 1: Initialize count variable
		        int count = 0;

		        // Step 2: Split the text into words
		        String[] words = text.split(" ");

		        // Step 3: Nested loops to compare words
		        for (int i = 0; i < words.length; i++) {

		            for (int j = i + 1; j < words.length; j++) {

		                // Step 4: If duplicate found
		                if (words[i].equals(words[j])) {
		                    words[j] = "";   // replace duplicate with empty string
		                    count++;
		                }
		            }
		        }

		        // Step 5: Print result if duplicates found
		        if (count > 0) {
		            for (String word : words) {
		                if (!word.equals("")) {
		                    System.out.print(word + " ");
		                }
		            }
		        }
		    }
		

		
	}


