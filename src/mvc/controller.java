package mvc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class controller {
	
	private model model;
	private view view;

    public controller(view view, model model) {
    	
    	this.model = model;
    	this.view = view;
    
//        pass return value of the view into the model
        model.isPal(view.getUserString());

//        logic to display whether string was palindrome or not
        if(model.isPalindrome()){
            view.isPalindrome();
        }else{
            view.notPalindrome();
        }

    }

}


