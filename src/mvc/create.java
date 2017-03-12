package mvc;

public class create {

    public static void main(String[] args) {

        view sView = new view();
        model sModel = new model();
        controller  sController = new controller(sView, sModel);
    }
}

