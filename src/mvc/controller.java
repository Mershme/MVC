package mvc;

public class controller {

    public controller(view view, model model) {

//        passes the value received from the user into the method in the model.
        model.numberSquared(view.getUserNumber());

//   Passes the number calculated in the model to the method in the view to display it.
     view.square(model.isSquared());
   

}
}

