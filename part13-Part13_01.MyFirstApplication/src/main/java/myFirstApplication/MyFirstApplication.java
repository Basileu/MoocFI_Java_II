package myFirstApplication;

import javafx.application.Application;
import javafx.stage.Stage;


public class MyFirstApplication extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello world!");
        stage.show();
    }
    

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        launch(MyFirstApplication.class);
    }

}
