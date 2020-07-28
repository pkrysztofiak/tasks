package pl.com.pixel.recruitment.tasks.task1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.com.pixel.recruitment.tasks.task1.view.InputView;
import pl.com.pixel.recruitment.tasks.task1.view.OutputView1;
import pl.com.pixel.recruitment.tasks.task1.view.OutputView2;

public class Task1App extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Stage stage1 = new Stage();
        stage1.setTitle("Output View 1");
        stage1.setScene(new Scene(new OutputView1(), 400, 400));
        
        Stage stage2 = new Stage();
        stage2.setTitle("Output View 2");
        stage2.setScene(new Scene(new OutputView2(), 400, 400));
        
        Stage stage3 = new Stage();
        stage3.setTitle("Input View");
        stage3.setScene(new Scene(new InputView(), 400, 400));
        
        stage1.show();
        stage2.show();
        stage3.show();
    }
}
