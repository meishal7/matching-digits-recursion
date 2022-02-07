/** 
* TITLE: MainHowManyDigitsMatch.java 
* AUTHOR: Elena Mudrakova   
* COURSE: CS 112 Intro to CS II - Java  
* MODULE: 4
* PROJECT: Lab 09_HowManyDigits
* LAST MODIFIED: 09/30/2020
* DESCRIPTION: this program caccepts two non-negative integers as parameters 
* and that returns the number of digits that match between them with recursive method
*
* ALGORITHM: 
* declare static int count = 0;
    static int matches = 0;
    static int length = 0;
* declare public static void howManyDigitsMatch(int n1, int n2)
* if one or both args negative > throw an exception
* convert strings to int
* check wicth str length is less and make it equal to int length
* if count < length 
*   count++
*   if str1 last char == str2 last char > matches++
*   else > call recursive method again
* else print matches 
*
* 
* 
*/   

public class MainHowManyDigitsMatch{
    /**
     * int count = 0
     * Count is used in howManyDigitsMatch(int n1, int n2) caclulations
     */
    public static int count = 0;
    /**
     * int matches = 0
     * int matches is used for counting how many matches appear
     */
    public static int matches = 0;
    /**
     * int length
     * var length is used in str.length
     */
    public static int length = 0;
    /**
     * Checks digits in numbers for matching
     * Digits are equa if position and value are equal
     * @param n1 first number for checking
     * @param n2 second number for checking
     * @throws IllegalArgumentException if one or both numbers negative
     */
    public static void howManyDigitsMatch(int n1, int n2) throws IllegalArgumentException{
        if(n1 < 0 || n2 < 0) throw new IllegalArgumentException("Numbers have to be positive.");
        
        //Convert int to string
        String str1 = Integer.toString(n1);
        String str2 = Integer.toString(n2);
        //Validate str length
        if(str1.length() > str2.length()){
            length = str2.length();
        }
        else{
            length = str1.length();
        }
        
        if(count < length){
            count++;
            if(str1.charAt(str1.length()-count) == str2.charAt(str2.length()-count)){
               matches++;
            }
           howManyDigitsMatch(n1, n2);
        }
        else System.out.println("matches is " + matches);
    }
       
    
    public static void main(String[] args) {
        //howManyDigitsMatch(38, 34);
        //howManyDigitsMatch(5, 5552);
        //howManyDigitsMatch(892, 892);
        //howManyDigitsMatch(298892, 7892);
        //howManyDigitsMatch(380, 0);
        //howManyDigitsMatch(123456, 654321);
        howManyDigitsMatch(1234567, 67);
    }
}

