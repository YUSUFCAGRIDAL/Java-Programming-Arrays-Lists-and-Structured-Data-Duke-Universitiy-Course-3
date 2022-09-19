
[Implementing the Caesar Cipher]

Assignment 1: Word Play

You will write a program to transform words from a file into another form, such as replacing vowels with an asterix.
Specifically, you should do the following.

Create a new class called WordPlay.
Write a method isVowel that has one Char parameter named ch. This method returns true if ch is a vowel (one of 'a', 'e', 'i', 'o', or 'u' or the uppercase versions) and false otherwise.

You should write a tester method to see if this method works correctly. For example, isVowel(‘F’) should return false, and isVowel(‘a’) should return true.

Write a method replaceVowels that has two parameters, a String named phrase and a Char named ch. This method should return a String that is the string phrase with all the vowels (uppercase or lowercase) replaced by ch. For example, the call replaceVowels(“Hello World”, ‘*’) returns the string “H*ll* W*rld”. Be sure to call the method isVowel that you wrote and also test this method.

Write a method emphasize with two parameters, a String named phrase and a character named ch. This method should return a String that is the string phrase but with the Char ch (upper- or lowercase) replaced by
‘*’ if it is in an odd number location in the string (e.g. the first character has an odd number location but an even index, it is at index 0), or

‘+’ if it is in an even number location in the string (e.g. the second character has an even number location but an odd index, it is at index 1).

For example, the call emphasize(“dna ctgaaactga”, ‘a’) would return the string “dn* ctg+*+ctg+”, and the call emphasize(“Mary Bella Abracadabra”, ‘a’) would return the string “M+ry Bell+ +br*c*d*br+”. Be sure to test this method.

Assignment 2: Caesar Cipher

You will start with the Caesar Cipher algorithm you learned about in the videos, and you will make some enhancements to it, so that it works with all letters (both uppercase and lowercase) and to make it a little bit harder to decrypt. Write these methods in a CaesarCipher class you can use in the next lesson.
Specifically, you should do the following:
Create a new class called CaesarCipher.
Write the method encrypt that has two parameters, a String named input and an int named key. This method returns a String that has been encrypted using the Caesar Cipher algorithm explained in the videos. Assume that all the alphabetic characters are uppercase letters. For example, the call encrypt(“FIRST LEGION ATTACK EAST FLANK!”, 23)

should return the string

“CFOPQ IBDFLK XQQXZH BXPQ CIXKH!”

Write the void method testCaesar that has no parameters. This method should read a file and encrypt the complete file using the Caesar Cipher algorithm, printing the encrypted message. You may want to include the lines:

FileResource fr = new FileResource();
String message = fr.asString();
String encrypted = encrypt(message, key);
System.out.println("key is " + key + "\n" + encrypted);

Modify the encrypt method to be able to handle both uppercase and lowercase letters. For example, encrypt(“First Legion”, 23) should return “Cfopq Ibdflk”, and encrypt(“First Legion”, 17) should return “Wzijk Cvxzfe”. Be sure to test the encrypt method.

Write the method encryptTwoKeys that has three parameters, a String named input, and two integers named key1 and key2. This method returns a String that has been encrypted using the following algorithm. Parameter key1 is used to encrypt every other character with the Caesar Cipher algorithm, starting with the first character, and key2 is used to encrypt every other character, starting with the second character. For example, the call encryptTwoKeys(“First Legion”, 23, 17) should return “Czojq Ivdzle”. Note the ‘F’ is encrypted with key 23, the first ‘i’ with 17, the ‘r’ with 23, and the ‘s’ with 17, etc. Be sure to test this method.


[Breaking the Caesar Cipher]

Assignment 1: Word lengths

Before attempting these assignments, you should type in, compile, and understand the example programs from the lesson, including: 1) counting the twenty most common words from Shakespeare’s plays, 2) counting the resulting random rolls of dice (how many 2’s, 3’s, 4’s, etc), and 3) automatic decryption of the Caesar Cipher using statistical letter occurrences.

You will write a program to figure out the most common word length of words from a file. To solve this problem you will need to keep track of how many words from a file are of each possible length. You should group all words of length 30 or more together, and you should not count basic punctuation that are the first or last characters of a group of characters.

Specifically, you should do the following:

Create a new class called WordLengths.
Write a void method countWordLengths that has two parameters, a FileResource named resource and an integer array named counts. This method should read in the words from resource and count the number of words of each length for all the words in resource, storing these counts in the array counts.
- For example, after this method executes, counts[k] should contain the number of words of length k.

- If a word has a non-letter as the first or last character, it should not be counted as part of the word length. For example, the word And, would be considered of length 3 (the comma is not counted), the word “blue-jeans” would be considered of length 10 (the double quotes are not counted, but the hyphen is). Note that we will miscount some words, such as “Hello,” which will be counted as 6 since we don’t count the double quotes but will count the comma, but that is OK as there should not be many words in that category.

- For any words equal to or larger than the last index of the counts array, count them as the largest size represented in the counts array.

- You may want to consider using the Character.isLetter method that returns true if a character is a letter, and false otherwise. For example, Character.isLetter(‘a’) returns true, and Character.isLetter(‘-’) returns false.

Write a void method testCountWordLengths that creates a FileResource so you can select a file, and creates a counts integer array of size 31. This method should call countWordLengths with a file and then print the number of words of each length. Test it on the small file smallHamlet.txt shown below.
Write a method indexOfMax that has one parameter named values that is an integer array. This method returns the index position of the largest element in values. Then add code to the method testCountWordLengths to call indexOfMax to determine the most common word length in the file. For example, calling indexOfMax after calling countWordLengths on the file smallHamlet.txt should return 3.
First test your program on a small file, such as this simple file shown called smallHamlet.txt:

Laer. My necessaries are embark'd. Farewell.
And, sister, as the winds give benefit
Note this file has words that are:
2 words of length 2: My as
3 words of length 3: are And the
2 words of length 4: Laer give
1 word of length 5: winds
1 word of length 6: sister
1 word of length 7: benefit
2 words of length 8: embark’d Farewell
1 word of length 11: necessaries

