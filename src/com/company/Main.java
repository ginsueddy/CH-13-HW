package com.company;

/*
Self Check:
    1.  You can do a sequential search using a for loop or you can use Arrays.sort then Arrays.binarySearch
    2.  It will only look at less than 1% since it keeps cutting the array size in half.
    3.  A sequential search because the point has no order without a comparable method.
    4.  When the array or the collection has been sorted.
    5.  A collection of strings will be ordered in alphabetical order. To change the order you need to implement the
        comparable method.
    6.  Collections.sort method would not work when used on a list of Point objects because they do not implement the
        comparable method. To make it work, you can implement a comparable method.
    7.  The following errors are listed below:
            a. The comparator be implemented in the Bank Account Class.
            b. compareTo should just be compare and accept two bank accounts not one
            c. The code should not refer to this.
            d. You cannot return the subtraction of two doubles from a compare method
    8.  There is a built in method named .reverseOrder that takes a comparator and returns a new one with the opposite
        order.
    9.  O(logN)
    10. O(N)
    11. O(N^2)
    12. O(N^2)
    13. O(N)
    14.
        a. O(N)
        b. O(N^2)
        c. O(N)
        d. O(N)
        e. O(LogB)
        f. O(N^3)
        g. O(N)
        h. O(N)
    15.
        a. O(N LogN)
        b. O(N^2)
        c. O(N^2logN)
        d. O(N)
        e. O(1)
        f. O(N)
        g. O(N!)

Exercise:
    1.
        a. 9; 9
        b. 5; -25
        c. 1; 1
        d. 0; -1
    2.
        a. 3; -8
        b. 7; 7
        c. 10; 10
        d. 0; -1
    3.
        a. 8; 8
        b. 2; -5
        c. 12; 12
        d. 13; -95
    4. O(N) because there is a single for loop

    5. O(N) because there is a single for loop

    6. O(N) because there is a single for loop

    7. O(N) because there is a single for loop

    8. The state of each element would be:
        num1: 63: goes before 72
              9: stays the same
              45: moves up until before 54
              72: goes to the end
              27: goes up one after 18
              18 stays the same
              54: stays the same
              36: stays the same
        num2: 37: goes up two next to 48
              29: goes up one next to 37
              19: goes all the way up next to 12
              48: goes one up next to 55
              23: stays the same
              55: stays the same
              74: stays the same
              12: stays the same

    9. The trace would look like:
        1. {63, 9, 45, 72} and {27, 18, 54, 36}
        2. {63, 9}, {45, 72}, {27, 18} and {54, 36}
        3. {9, 63}, {45, 72}, {18, 27} and {36, 54}
        4. {9, 45, 63, 72} and {18, 27, 36, 54}
        5. {9, 18, 27, 36, 45, 54, 63, 72}

    10. The state of each element would look like:
        num3: 8: would go after 5
              5: goes after 3
              -9: stays the same
              14: goes after 8
              0: goes after -1
              -1: stays the same
              -7: stays the same
              3: stays the same

        num4: 15: goes after 5
              56: goes after 39
              24: goes after 15
              5: goes after -4
              39: goes after 27
              -4: stays the same
              27: goes after 24
              10: goes after 5

    11. The trace would look like:
        1. {8, 5, -9, 14} and {0, -1, -7, 3}
        2. {8, 5}, {-9, 14}, {0, -1}, and {-7, 3}
        3. {5, 8}, {-9, 14}, {-1, 0}, and {-7, 3}
        4. {-9, 5, 8, 14} and {-7, -1, 0, 3}
        5. {-9, -7, -1, 0, 3, 5, 8, 14}

    12. The state of each element would look like:
        num5:
            22 goes after 11
            44 goes after 33
            11 stays the same
            88 goes after 77
            66 goes after 55
            33 goes after 22
            55 goes after 44
            77 goes after 66
        num6:
            -3 goes after -4
            -6 goes after -7
            -1 goes after -2
            -5 goes after -6
            0 goes after -1
            -2 goes after -3
            -4 goes after -5
            -7 stays the same

    13. The trace would look like:
        1. {22, 44, 11, 88} {66, 33, 55, 77}
        2. {22, 44} {11, 88} {66, 33} {55, 77}
        3. {22, 44} {11, 88} {33, 66} {55, 77}
        4. {11, 22, 44, 88} {33, 55, 66, 77}
        5. {11, 22, 33, 44, 55, 66, 77, 88}

*/
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        num14();
    }

    public static void num14 () throws FileNotFoundException {
        Scanner sc = new Scanner(new File("dictionary words.txt"));

        String [] dictionaryWords = new String [172823];
        for(int i = 0; i < dictionaryWords.length; i++){
            dictionaryWords[i] = sc.next();
        }
        String word1 = "goodbye";
        String word2 = "hello";
        int word1Index = 0;
        int word2Index = 0;

        int min = 0;

        int max = dictionaryWords.length - 1;

        while(min <= max){
            word1Index = (min + max) / 2;
            if(dictionaryWords[word1Index].compareTo(word1) < 0){
                min = word1Index + 1;
            }
            else if(dictionaryWords[word1Index].compareTo(word1) > 0){
                max = word1Index - 1;
            }
            else{
                break;
            }
        }
        min = 0;

        max = dictionaryWords.length - 1;
        
        //create a new method for this

        while(min <= max){
            word2Index = (min + max) / 2;
            if(dictionaryWords[word2Index].compareTo(word2) < 0){
                min = word2Index + 1;
            }
            else if(dictionaryWords[word2Index].compareTo(word2) > 0){
                max = word2Index - 1;
            }
            else{
                break;
            }
        }
        System.out.println(word2Index - word1Index);

    }


}
