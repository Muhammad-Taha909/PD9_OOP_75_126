/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd9_oop_75_126;

/**
 *
 * @author Muhammad Taha
 */
import java.util.*;
import javax.swing.JOptionPane;

public class Task1 {

    /**
     * This function count the words in a String
     *
     * @return int (no. of words)
     */
    public static int wordCounter(String s) {
        int count = 1;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                count++;
            }
        }
        return count;
    }

    /**
     * This function count the vowels in a String
     *
     * @return int (no. of vowels)
     */
    public static int vowelcounter(String s) {
        int count = 0;
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A' || arr[i] == 'a' || arr[i] == 'E' || arr[i] == 'e' || arr[i] == 'I' || arr[i] == 'i'
                    || arr[i] == 'O' || arr[i] == 'o' || arr[i] == 'U' || arr[i] == 'u') {
                count++;
            }
        }
        return count;
    }

    /**
     * This function count the punctuations in a String
     *
     * @return int (no. of punctuations)
     */
    public static int puncCount(String s) {
        int count = 0;
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ';' || arr[i] == ':' || arr[i] == '.' || arr[i] == 34 || arr[i] == 39 || arr[i] == '!' || arr[i] == ','
                    || arr[i] == '-') {
                count++;
            }

        }

        return count;
    }

    /**
     * This function checks if a sub string is a part of string or not
     * @return Boolean (true when match is found, else false)
     */
    public static boolean findSubString(String s, String sub) {
        if(s.length()<sub.length()){
            return false;
        }
        boolean check = false;
        char[] stringArray = s.toCharArray();
        char[] subArray = sub.toCharArray();
        List<Integer> intList = new ArrayList<>();
        try {
            for (int i = 0; i < stringArray.length; i++) {
                if (subArray[0] == stringArray[i]) {
                    intList.add(i);
                    //System.out.println(i);
                }
            }
            int count = 0;
            while (count != intList.size()) {
                for (int i = 0; i < subArray.length; i++) {
                    for (int j = intList.get(count); j < (intList.get(count) + subArray.length); j++) {

                        if (subArray[i] == stringArray[j]) {
                            check = true;
                            i++;
                        } else {
                            check = false;
                            break;
                        }
                    }

                    if (check) {
                        return true;
                    } else {
                        break;
                    }
                }
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {

        }

        return check;
    }

}
