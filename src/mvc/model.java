package mvc;

public class model {

    int numberSquared;

//    default constructor
    public model(){

    }

//    squares the number received from the user.
    public void numberSquared(int userNumber){
        numberSquared = userNumber * userNumber;
    }
    
// returns the number that was squared.
    public int isSquared(){
    	return numberSquared;
    }


}

