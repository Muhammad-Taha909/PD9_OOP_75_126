/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author M_Khuzaima
 */
public class MyString {

    String str = null;

    /**
     * Palindrome is the string which is read same from both start and the end
     * @return method returns true if this is palindrome else false
     */
    public boolean isPalindrome () {
        
        int size = this.str.length();
        
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) != str.charAt(size-1-i)) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * 
     * @param s the string from which integers are to be removed
     * @return method returns the new string which does not contains the digits
     */
    public static String removeInteger(String s) {
        char arr[] = s.toCharArray();
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] >= '0' && arr[i] <= '9')) {
                temp = temp + arr[i];
            }
        }
        return temp;
    }

    /**
     * 
     * @param s the string to be manipulated
     * @return method return the new string which does not contain two consecutive spaces anywhere
     */
    public static String ridMultipleBlank(String s) {
        char arr[] = s.toCharArray();
        String temp = "";
        try {
            for (int i = 0; i < arr.length; i++) {
                if (!(arr[i] == ' ' && arr[i + 1] == ' ')) {
                    temp += arr[i];
                }
            }
        } catch (ArrayIndexOutOfBoundsException exception) {

        }
        return temp;
    }
    
    /**
     * it removes all the characters except alphabets, digits and spaces
     * @return method returns the string which does not have punctuation characters
     */
    public String removePunctuation () {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) || ch == ' ' || ch == '\t' || ch == '\n') {
                result += ch;
            }
        }
        return result;
    }
    
    /**
     * 
     * @return method returns the new string which does not contains the vowels
     */
    public String removeVowels () {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    break;
                default:
                    result += ch;
            }
        }
        return result;
    }
    
    /**
     * it reverses the given string
     * @return reversed string
     */
    public String reverse () {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }
    
    /**
     * it removes all the characters except alphabets
     * @return the new string which only contains alphabets
     */
    public String extractAlphabets () {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                result += ch;
            }
        }
        return result;
    }
    
    /**
     * it removes all the characters except Digits
     * @return the new string which only contains Digits
     */
    public String extractDigits () {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                result += ch;
            }
        }
        return result;
    }
   
    /**
     * Camel case contains alphabets and digits and there is no extra space
     * between letters.
     * @return the new String which is only alphanumeric and first letter of each word is capital
     */
    public String toCamelCase() {
        
        String result = "";

        boolean toCapital = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch) || ch == '_') {
                result += toCapital ? Character.toUpperCase(ch) : ch;
                toCapital = false;
            }
            else {
                toCapital = ch == ' ';
            }
        }
        
        return result;
    }
    
    /**
     * 
     * @return method returns the new string in which first letter of each digit is capital
     */
    public String toTitleCase() {
        
        String result = "";

        boolean toCapital = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result += toCapital ? Character.toUpperCase(ch) : ch;
            toCapital = false;
            toCapital = ch == ' ';
            
        }
        
        return result;
    }
    
    
    public char charAt(int i) {
        return str.charAt(i);
    }
    
    public int length() {
        return str.length();
    }
    
    public char [] toCharArry() {
        return str.toCharArray();
    }
    
    public String [] split(String regex) {
        return str.split(regex);
    }
    
    public boolean isEmpty () {
        return str.isEmpty();
    }
    
    public boolean equals(String str) {
        return this.str.equals(str);
    }
    
    /**
     * compares MyString with the given string
     * @param str the string to compared with
     * @return true if both are the same string
     */
    public boolean equals(MyString str) {
        return this.str.equals(str.toString());
    }
    
    
    @Override
    public String toString() {
        return str;
    }
    
    public MyString(String str) {
        this.str = str;
    }

    
    
    
    
    
    
}