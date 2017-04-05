package mvc;

public class create {

    public static void main(String[] args) {
//        create view
        view view = new view();
//        create model
       model model = new model();

//        create controller and pass view and model into constructor
        controller controller = new controller(view, model);
    }
}


