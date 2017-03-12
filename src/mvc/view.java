package mvc;

import java.util.Scanner;

public class view {
//  Scanner for user Input
    Scanner input = new Scanner(System.in);

    int number;

//    prints the info that the user will see
    public view() {
        System.out.println("Square Calculator");
        System.out.println("Enter the number to square:");
        number = input.nextInt();
    }

//  returns the number entered by the user.
    public int getUserNumber() {
        return number;
    }


    public void square(int square){
        System.out.println("This is your number squared: " + square);
    }
    
    


}

