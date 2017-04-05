package mvc;

public class model {

//    variable to hold true or false
    boolean isPalindrome;

//    default constructor
    public model(){

    }

//    checks to see if string is palindrome and saves boolean
    public void isPal(String pal){
        isPalindrome = pal.equals(new StringBuilder(pal).reverse().toString());
    }

//    returns boolean palindrome value
    public boolean isPalindrome() {
        return isPalindrome;
    }

}


