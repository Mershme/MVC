package mvc;

import java.util.Scanner;

public class view {
//    make scanner for input
    Scanner input = new Scanner(System.in);
//    store user input
    String userString;

//    print palindrome checker intro upon instance creation
    public view() {
        System.out.println("Please enter in a word of your choice:");
        userString = input.nextLine();
    }

//    returns userString
    public String getUserString() {
        return userString;
    }


    public void isPalindrome(){
        System.out.println("Yes! This is a Palindrome.");
    }

    public void notPalindrome(){
        System.out.println("No! This is not a Palindrome.");
    }

}
